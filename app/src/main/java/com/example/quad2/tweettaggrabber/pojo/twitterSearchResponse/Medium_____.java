
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Medium_____ {

    @SerializedName("w")
    @Expose
    private long w;
    @SerializedName("h")
    @Expose
    private long h;
    @SerializedName("resize")
    @Expose
    private String resize;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Medium_____() {
    }

    /**
     * 
     * @param w
     * @param resize
     * @param h
     */
    public Medium_____(long w, long h, String resize) {
        super();
        this.w = w;
        this.h = h;
        this.resize = resize;
    }

    public long getW() {
        return w;
    }

    public void setW(long w) {
        this.w = w;
    }

    public long getH() {
        return h;
    }

    public void setH(long h) {
        this.h = h;
    }

    public String getResize() {
        return resize;
    }

    public void setResize(String resize) {
        this.resize = resize;
    }

}
