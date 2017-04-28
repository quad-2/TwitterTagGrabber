
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description_ {

    @SerializedName("urls")
    @Expose
    private List<Object> urls = null;

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
    public Description_(List<Object> urls) {
        super();
        this.urls = urls;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "Description_{" +
                "urls=" + urls +
                '}';
    }
}
