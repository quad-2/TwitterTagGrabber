
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url_ {

    @SerializedName("urls")
    @Expose
    private List<Url__> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url_() {
    }

    /**
     * 
     * @param urls
     */
    public Url_(List<Url__> urls) {
        super();
        this.urls = urls;
    }

    public List<Url__> getUrls() {
        return urls;
    }

    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }

    public Url_ withUrls(List<Url__> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Url_{" +
                "urls=" + urls +
                '}';
    }
}
