package com.example.quad2.tweettaggrabber.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quad2.tweettaggrabber.R;
import com.example.quad2.tweettaggrabber.adapter.TweetAdapter;
import com.example.quad2.tweettaggrabber.interfaces.TwitterApiInterface;
import com.example.quad2.tweettaggrabber.ottoUtils.BusProvider;
import com.example.quad2.tweettaggrabber.ottoUtils.DataRefreshEvent;
import com.example.quad2.tweettaggrabber.pojo.AuthorizationResponse;
import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.SearchResponseData;
import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.Status;
import com.example.quad2.tweettaggrabber.services.UpdateTweetService;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String tweetBaseUrl = "https://api.twitter.com/1.1/search/";
    private static final String authorizebaseUrl = "https://api.twitter.com/oauth2/";
    private String bearerToken, hashTag;
    private List<Status> statuses = new ArrayList<>();
    private RecyclerView tweetRv;
    private TweetAdapter adapter;
    private EditText userInput;
    private Button searchBtn;
    private ProgressDialog dialog;
    private Intent intent;
    private Bus bus = BusProvider.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tweetRv = (RecyclerView) findViewById(R.id.tweet_rv);
        userInput = (EditText) findViewById(R.id.hashTag_text);
        searchBtn = (Button) findViewById(R.id.search_btn);
        dialog = new ProgressDialog(this);
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        bus.register(this);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hashTag = userInput.getText().toString();
                if (hashTag != null) {

                    if (hashTag.length() == 0) {
                        userInput.setError("Please enter a word");
                    } else if (hashTag.length() > 0 && hashTag.contains(" ")) {
                        userInput.setError("it can't contain spaces");
                    } else if (hashTag.length() > 0 && hashTag.contains("#")) {
                        userInput.setError("Please enter the word without #");
                    } else {
                        getTweetData();
                        intent.putExtra("hashTag", hashTag);
                        intent.putExtra("bearerToken", bearerToken);
                        startService(intent);
                    }


                }
            }
        });
        getAccessToken();
        intent = new Intent(this, UpdateTweetService.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //registerReceiver(getUpdates, new IntentFilter(UpdateTweetService.BROADCAST_ACTION));
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopService(intent);
        //unregisterReceiver(getUpdates);
    }

    @Subscribe
    public void getRefreshedTweets(DataRefreshEvent event) {
        if (event.getStatuses() != null && event.getStatuses().size() > 0) {
            statuses.clear();
            statuses = event.getStatuses();
            setTweetRv();
        }
    }

    public void getTweetData() {
        dialog.show();
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
                dialog.dismiss();
                if (response != null && response.body() != null) {
                    if (response.body().getStatuses() != null && response.body().getStatuses().size() > 0) {
                        statuses = response.body().getStatuses();
                        setTweetRv();
                    }
                }
            }

            @Override
            public void onFailure(Call<SearchResponseData> call, Throwable t) {
                dialog.dismiss();
                t.printStackTrace();
            }
        });

    }

    public void getAccessToken() {
        dialog.show();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(authorizebaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        String twitterEncodedKey = "Basic " + getString(R.string.twitter_encoded_key);

        TwitterApiInterface twitterApi = retrofit.create(TwitterApiInterface.class);
        Call<AuthorizationResponse> call = twitterApi.getBearerToken(twitterEncodedKey, "client_credentials");
        call.enqueue(new Callback<AuthorizationResponse>() {
            @Override
            public void onResponse(Call<AuthorizationResponse> call, Response<AuthorizationResponse> response) {
                dialog.dismiss();
                if (response != null && response.body() != null) {
                    AuthorizationResponse authResponse = response.body();
                    if (authResponse.getTokenType() != null && authResponse.getTokenType().length() > 0) {
                        if (authResponse.getTokenType().equalsIgnoreCase("bearer")) {
                            if (authResponse.getAccessToken() != null && authResponse.getAccessToken().length() > 0) {
                                bearerToken = authResponse.getAccessToken();
                                Log.d("log1", "****" + response.body() + "***" + bearerToken);
                            }
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<AuthorizationResponse> call, Throwable t) {
                dialog.dismiss();
                t.printStackTrace();
            }
        });
    }

    public void setTweetRv() {
        adapter = new TweetAdapter(this, statuses);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        tweetRv.setHasFixedSize(true);
        tweetRv.setAdapter(adapter);
        tweetRv.setLayoutManager(llm);
        adapter.notifyDataSetChanged();
    }
}
