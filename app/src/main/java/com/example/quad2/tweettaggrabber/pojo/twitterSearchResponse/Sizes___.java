
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes___ {

    @SerializedName("large")
    @Expose
    private Large___ large;
    @SerializedName("medium")
    @Expose
    private Medium_______ medium;
    @SerializedName("thumb")
    @Expose
    private Thumb___ thumb;
    @SerializedName("small")
    @Expose
    private Small___ small;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes___() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param medium
     * @param large
     */
    public Sizes___(Large___ large, Medium_______ medium, Thumb___ thumb, Small___ small) {
        super();
        this.large = large;
        this.medium = medium;
        this.thumb = thumb;
        this.small = small;
    }

    public Large___ getLarge() {
        return large;
    }

    public void setLarge(Large___ large) {
        this.large = large;
    }

    public Medium_______ getMedium() {
        return medium;
    }

    public void setMedium(Medium_______ medium) {
        this.medium = medium;
    }

    public Thumb___ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb___ thumb) {
        this.thumb = thumb;
    }

    public Small___ getSmall() {
        return small;
    }

    public void setSmall(Small___ small) {
        this.small = small;
    }

}
