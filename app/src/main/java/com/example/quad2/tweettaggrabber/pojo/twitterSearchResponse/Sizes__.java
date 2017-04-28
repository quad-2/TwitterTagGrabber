
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes__ {

    @SerializedName("large")
    @Expose
    private Large__ large;
    @SerializedName("medium")
    @Expose
    private Medium_____ medium;
    @SerializedName("thumb")
    @Expose
    private Thumb__ thumb;
    @SerializedName("small")
    @Expose
    private Small__ small;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes__() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param medium
     * @param large
     */
    public Sizes__(Large__ large, Medium_____ medium, Thumb__ thumb, Small__ small) {
        super();
        this.large = large;
        this.medium = medium;
        this.thumb = thumb;
        this.small = small;
    }

    public Large__ getLarge() {
        return large;
    }

    public void setLarge(Large__ large) {
        this.large = large;
    }

    public Medium_____ getMedium() {
        return medium;
    }

    public void setMedium(Medium_____ medium) {
        this.medium = medium;
    }

    public Thumb__ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

    public Small__ getSmall() {
        return small;
    }

    public void setSmall(Small__ small) {
        this.small = small;
    }

}
