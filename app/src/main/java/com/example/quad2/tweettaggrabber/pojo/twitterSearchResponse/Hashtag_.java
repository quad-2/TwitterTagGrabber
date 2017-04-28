
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hashtag_ {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hashtag_() {
    }

    /**
     * 
     * @param text
     * @param indices
     */
    public Hashtag_(String text, List<Long> indices) {
        super();
        this.text = text;
        this.indices = indices;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return "Hashtag_{" +
                "text='" + text + '\'' +
                ", indices=" + indices +
                '}';
    }
}
