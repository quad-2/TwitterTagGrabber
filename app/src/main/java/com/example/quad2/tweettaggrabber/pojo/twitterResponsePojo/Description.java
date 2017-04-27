
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("urls")
    @Expose
    private List<Url___> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param urls
     */
    public Description(List<Url___> urls) {
        super();
        this.urls = urls;
    }

    public List<Url___> getUrls() {
        return urls;
    }

    public void setUrls(List<Url___> urls) {
        this.urls = urls;
    }

    public Description withUrls(List<Url___> urls) {
        this.urls = urls;
        return this;
    }

    @Override
    public String toString() {
        return "Description{" +
                "urls=" + urls +
                '}';
    }
}
