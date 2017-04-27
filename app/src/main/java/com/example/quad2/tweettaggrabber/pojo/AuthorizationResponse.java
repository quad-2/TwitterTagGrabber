package com.example.quad2.tweettaggrabber.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorizationResponse {

    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("access_token")
    @Expose
    private String accessToken;

    /**
     * No args constructor for use in serialization
     *
     */
    public AuthorizationResponse() {
    }

    /**
     *
     * @param tokenType
     * @param accessToken
     */
    public AuthorizationResponse(String tokenType, String accessToken) {
        super();
        this.tokenType = tokenType;
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AuthorizationResponse withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AuthorizationResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    @Override
    public String toString() {
        return "AuthorizationResponse{" +
                "tokenType='" + tokenType + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
