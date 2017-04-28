
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url__ {

    @SerializedName("urls")
    @Expose
    private List<Url___> urls = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url__() {
    }

    /**
     * 
     * @param urls
     */
    public Url__(List<Url___> urls) {
        super();
        this.urls = urls;
    }

    public List<Url___> getUrls() {
        return urls;
    }

    public void setUrls(List<Url___> urls) {
        this.urls = urls;
    }

}
