
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities {

    @SerializedName("hashtags")
    @Expose
    private List<Hashtag> hashtags = null;
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = null;
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention> userMentions = null;
    @SerializedName("urls")
    @Expose
    private List<Url> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities(List<Hashtag> hashtags, List<Object> symbols, List<UserMention> userMentions, List<Url> urls) {
        super();
        this.hashtags = hashtags;
        this.symbols = symbols;
        this.userMentions = userMentions;
        this.urls = urls;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public Entities withHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public Entities withSymbols(List<Object> symbols) {
        this.symbols = symbols;
        return this;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public Entities withUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
        return this;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Entities withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "hashtags=" + hashtags +
                ", symbols=" + symbols +
                ", userMentions=" + userMentions +
                ", urls=" + urls +
                '}';
    }
}
