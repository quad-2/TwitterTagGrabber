
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities___ {

    @SerializedName("url")
    @Expose
    private Url__ url;
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
    public Entities___(Url__ url, Description_ description) {
        super();
        this.url = url;
        this.description = description;
    }

    public Url__ getUrl() {
        return url;
    }

    public void setUrl(Url__ url) {
        this.url = url;
    }

    public Description_ getDescription() {
        return description;
    }

    public void setDescription(Description_ description) {
        this.description = description;
    }

}
