
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities_ {

    @SerializedName("url")
    @Expose
    private Url_ url;
    @SerializedName("description")
    @Expose
    private Description description;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities_() {
    }

    /**
     * 
     * @param description
     * @param url
     */
    public Entities_(Url_ url, Description description) {
        super();
        this.url = url;
        this.description = description;
    }

    public Url_ getUrl() {
        return url;
    }

    public void setUrl(Url_ url) {
        this.url = url;
    }

    public Entities_ withUrl(Url_ url) {
        this.url = url;
        return this;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Entities_ withDescription(Description description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Entities_{" +
                "url=" + url +
                ", description=" + description +
                '}';
    }
}
