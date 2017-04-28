
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

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
    private List<Object> userMentions = null;
    @SerializedName("urls")
    @Expose
    private List<Url_> urls = null;
    @SerializedName("media")
    @Expose
    private List<Medium____> media = null;

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
     * @param media
     * @param userMentions
     */
    public Entities__(List<Hashtag_> hashtags, List<Object> symbols, List<Object> userMentions, List<Url_> urls, List<Medium____> media) {
        super();
        this.hashtags = hashtags;
        this.symbols = symbols;
        this.userMentions = userMentions;
        this.urls = urls;
        this.media = media;
    }

    public List<Hashtag_> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag_> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Url_> getUrls() {
        return urls;
    }

    public void setUrls(List<Url_> urls) {
        this.urls = urls;
    }

    public List<Medium____> getMedia() {
        return media;
    }

    public void setMedia(List<Medium____> media) {
        this.media = media;
    }

}
