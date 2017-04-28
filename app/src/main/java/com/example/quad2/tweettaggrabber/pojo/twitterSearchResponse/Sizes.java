
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("large")
    @Expose
    private Large large;
    @SerializedName("medium")
    @Expose
    private Medium_ medium;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("small")
    @Expose
    private Small small;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param medium
     * @param large
     */
    public Sizes(Large large, Medium_ medium, Thumb thumb, Small small) {
        super();
        this.large = large;
        this.medium = medium;
        this.thumb = thumb;
        this.small = small;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Medium_ getMedium() {
        return medium;
    }

    public void setMedium(Medium_ medium) {
        this.medium = medium;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

}
