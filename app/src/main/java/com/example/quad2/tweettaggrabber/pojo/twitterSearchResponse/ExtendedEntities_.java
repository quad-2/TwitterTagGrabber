
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedEntities_ {

    @SerializedName("media")
    @Expose
    private List<Medium______> media = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtendedEntities_() {
    }

    /**
     * 
     * @param media
     */
    public ExtendedEntities_(List<Medium______> media) {
        super();
        this.media = media;
    }

    public List<Medium______> getMedia() {
        return media;
    }

    public void setMedia(List<Medium______> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "ExtendedEntities_{" +
                "media=" + media +
                '}';
    }
}
