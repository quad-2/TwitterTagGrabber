
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedEntities {

    @SerializedName("media")
    @Expose
    private List<Medium__> media = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtendedEntities() {
    }

    /**
     * 
     * @param media
     */
    public ExtendedEntities(List<Medium__> media) {
        super();
        this.media = media;
    }

    public List<Medium__> getMedia() {
        return media;
    }

    public void setMedia(List<Medium__> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "ExtendedEntities{" +
                "media=" + media +
                '}';
    }
}
