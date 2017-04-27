
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities__ {

    @SerializedName("hashtags")
    @Expose
    private List<Hashtag_> hashtags = null;
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = null;
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention_> userMentions = null;
    @SerializedName("urls")
    @Expose
    private List<Url____> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities__() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities__(List<Hashtag_> hashtags, List<Object> symbols, List<UserMention_> userMentions, List<Url____> urls) {
        super();
        this.hashtags = hashtags;
        this.symbols = symbols;
        this.userMentions = userMentions;
        this.urls = urls;
    }

    public List<Hashtag_> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag_> hashtags) {
        this.hashtags = hashtags;
    }

    public Entities__ withHashtags(List<Hashtag_> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public Entities__ withSymbols(List<Object> symbols) {
        this.symbols = symbols;
        return this;
    }

    public List<UserMention_> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention_> userMentions) {
        this.userMentions = userMentions;
    }

    public Entities__ withUserMentions(List<UserMention_> userMentions) {
        this.userMentions = userMentions;
        return this;
    }

    public List<Url____> getUrls() {
        return urls;
    }

    public void setUrls(List<Url____> urls) {
        this.urls = urls;
    }

    public Entities__ withUrls(List<Url____> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Entities__{" +
                "hashtags=" + hashtags +
                ", symbols=" + symbols +
                ", userMentions=" + userMentions +
                ", urls=" + urls +
                '}';
    }
}
