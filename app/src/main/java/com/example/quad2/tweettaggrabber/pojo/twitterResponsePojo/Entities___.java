
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities___ {

    @SerializedName("url")
    @Expose
    private Url_____ url;
    @SerializedName("description")
    @Expose
    private Description_ description;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities___() {
    }

    /**
     * 
     * @param description
     * @param url
     */
    public Entities___(Url_____ url, Description_ description) {
        super();
        this.url = url;
        this.description = description;
    }

    public Url_____ getUrl() {
        return url;
    }

    public void setUrl(Url_____ url) {
        this.url = url;
    }

    public Entities___ withUrl(Url_____ url) {
        this.url = url;
        return this;
    }

    public Description_ getDescription() {
        return description;
    }

    public void setDescription(Description_ description) {
        this.description = description;
    }

    public Entities___ withDescription(Description_ description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Entities___{" +
                "url=" + url +
                ", description=" + description +
                '}';
    }
}
