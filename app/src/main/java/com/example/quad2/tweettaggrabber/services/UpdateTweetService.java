package com.example.quad2.tweettaggrabber.services;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.util.Log;

import com.example.quad2.tweettaggrabber.R;
import com.example.quad2.tweettaggrabber.interfaces.TwitterApiInterface;
import com.example.quad2.tweettaggrabber.ottoUtils.BusProvider;
import com.example.quad2.tweettaggrabber.ottoUtils.DataRefreshEvent;
import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.SearchResponseData;
import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.Status;
import com.squareup.otto.Bus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by praveen on 27/4/17.
 */

public class UpdateTweetService extends Service {

    public static final String BROADCAST_ACTION = "com.example.quad2.tweettaggrabber";
    private static final String tweetBaseUrl = "https://api.twitter.com/1.1/search/";
    private final Handler handler = new Handler();
    private Intent intent;
    private String hashTag, bearerToken;
    private List<Status> statuses = new ArrayList<>();
    private Bus bus = BusProvider.getInstance();

    @Override
    public void onCreate() {
        super.onCreate();
        bus.register(this);
        intent = new Intent(BROADCAST_ACTION);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            hashTag = bundle.getString("hashTag");
            bearerToken = bundle.getString("bearerToken");
        }
        if (hashTag != null && bearerToken != null && bearerToken.length() > 0 && hashTag.length() > 0) {
            handler.removeCallbacks(sendUpdates);
            handler.postDelayed(sendUpdates, 1000);
        } else {
            handler.removeCallbacks(sendUpdates);
        }
        return Service.START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private Runnable sendUpdates = new Runnable() {
        @Override
        public void run() {
            if (bearerToken != null && hashTag != null && bearerToken.length() > 0 && hashTag.length() > 0) {
                getTweets();
                handler.postDelayed(this, 10000);
            }
        }
    };

    private void getTweets() {
        statuses.clear();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(tweetBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        TwitterApiInterface tweetApi = retrofit.create(TwitterApiInterface.class);
        Call<SearchResponseData> call = tweetApi.getTweets("Bearer " + bearerToken, hashTag, "recent");
        call.enqueue(new Callback<SearchResponseData>() {
            @Override
            public void onResponse(Call<SearchResponseData> call, Response<SearchResponseData> response) {
                if (response != null && response.body() != null) {
                    if (response.body().getStatuses() != null && response.body().getStatuses().size() > 0) {
                        bus.post(new DataRefreshEvent(response.body().getStatuses()));
                    }
                }
            }

            @Override
            public void onFailure(Call<SearchResponseData> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
