package com.example.quad2.tweettaggrabber.interfaces;

import com.example.quad2.tweettaggrabber.pojo.AuthorizationResponse;
import com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo.ApiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by praveen on 27/4/17.
 */

public interface TwitterApiInterface {

    @GET("tweets.json")
    Call<ApiResponse> getTweets(@Header("Authorization") String authorization,
                                @Query("q") String hashTag, @Query("result_type") String result_type);

    @FormUrlEncoded
    @POST("token")
    Call<AuthorizationResponse> getBearerToken(@Header("Authorization") String authorization, @Field("grant_type") String grant_type);
}
