
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

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
    @SerializedName("media")
    @Expose
    private List<Medium> media = null;

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
     * @param media
     * @param userMentions
     */
    public Entities(List<Hashtag> hashtags, List<Object> symbols, List<UserMention> userMentions, List<Url> urls, List<Medium> media) {
        super();
        this.hashtags = hashtags;
        this.symbols = symbols;
        this.userMentions = userMentions;
        this.urls = urls;
        this.media = media;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

}
