
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description_ {

    @SerializedName("urls")
    @Expose
    private List<Url_______> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description_() {
    }

    /**
     * 
     * @param urls
     */
    public Description_(List<Url_______> urls) {
        super();
        this.urls = urls;
    }

    public List<Url_______> getUrls() {
        return urls;
    }

    public void setUrls(List<Url_______> urls) {
        this.urls = urls;
    }

    public Description_ withUrls(List<Url_______> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Description_{" +
                "urls=" + urls +
                '}';
    }
}
