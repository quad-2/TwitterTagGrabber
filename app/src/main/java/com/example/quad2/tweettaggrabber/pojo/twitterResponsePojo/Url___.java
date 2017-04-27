
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url___ {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url___() {
    }

    /**
     * 
     * @param displayUrl
     * @param indices
     * @param expandedUrl
     * @param url
     */
    public Url___(String url, String expandedUrl, String displayUrl, List<Long> indices) {
        super();
        this.url = url;
        this.expandedUrl = expandedUrl;
        this.displayUrl = displayUrl;
        this.indices = indices;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Url___ withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public Url___ withExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
        return this;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public Url___ withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Url___ withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    @Override
    public String toString() {
        return "Url___{" +
                "url='" + url + '\'' +
                ", expandedUrl='" + expandedUrl + '\'' +
                ", displayUrl='" + displayUrl + '\'' +
                ", indices=" + indices +
                '}';
    }
}
