
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserMention {

    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserMention() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param screenName
     * @param indices
     * @param idStr
     */
    public UserMention(String screenName, String name, long id, String idStr, List<Long> indices) {
        super();
        this.screenName = screenName;
        this.name = name;
        this.id = id;
        this.idStr = idStr;
        this.indices = indices;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public UserMention withScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserMention withName(String name) {
        this.name = name;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserMention withId(long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public UserMention withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public UserMention withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    @Override
    public String toString() {
        return "UserMention{" +
                "screenName='" + screenName + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", idStr='" + idStr + '\'' +
                ", indices=" + indices +
                '}';
    }
}
