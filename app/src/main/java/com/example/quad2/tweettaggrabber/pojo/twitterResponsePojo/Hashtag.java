
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hashtag {

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
    public Hashtag() {
    }

    /**
     * 
     * @param text
     * @param indices
     */
    public Hashtag(String text, List<Long> indices) {
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

    public Hashtag withText(String text) {
        this.text = text;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Hashtag withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    @Override
    public String toString() {
        return "Hashtag{" +
                "text='" + text + '\'' +
                ", indices=" + indices +
                '}';
    }
}
