
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url_____ {

    @SerializedName("urls")
    @Expose
    private List<Url______> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url_____() {
    }

    /**
     * 
     * @param urls
     */
    public Url_____(List<Url______> urls) {
        super();
        this.urls = urls;
    }

    public List<Url______> getUrls() {
        return urls;
    }

    public void setUrls(List<Url______> urls) {
        this.urls = urls;
    }

    public Url_____ withUrls(List<Url______> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Url_____{" +
                "urls=" + urls +
                '}';
    }
}
