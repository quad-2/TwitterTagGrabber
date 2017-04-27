
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetweetedStatus {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("truncated")
    @Expose
    private boolean truncated;
    @SerializedName("entities")
    @Expose
    private Entities__ entities;
    @SerializedName("metadata")
    @Expose
    private Metadata_ metadata;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("is_quote_status")
    @Expose
    private boolean isQuoteStatus;
    @SerializedName("retweet_count")
    @Expose
    private long retweetCount;
    @SerializedName("favorite_count")
    @Expose
    private long favoriteCount;
    @SerializedName("favorited")
    @Expose
    private boolean favorited;
    @SerializedName("retweeted")
    @Expose
    private boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    private boolean possiblySensitive;
    @SerializedName("lang")
    @Expose
    private String lang;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RetweetedStatus() {
    }

    /**
     * 
     * @param inReplyToUserIdStr
     * @param retweeted
     * @param retweetCount
     * @param truncated
     * @param lang
     * @param id
     * @param inReplyToStatusIdStr
     * @param createdAt
     * @param place
     * @param coordinates
     * @param metadata
     * @param text
     * @param contributors
     * @param geo
     * @param inReplyToScreenName
     * @param entities
     * @param idStr
     * @param possiblySensitive
     * @param inReplyToStatusId
     * @param source
     * @param favoriteCount
     * @param favorited
     * @param inReplyToUserId
     * @param user
     * @param isQuoteStatus
     */
    public RetweetedStatus(String createdAt, long id, String idStr, String text, boolean truncated, Entities__ entities, Metadata_ metadata, String source, Object inReplyToStatusId, Object inReplyToStatusIdStr, Object inReplyToUserId, Object inReplyToUserIdStr, Object inReplyToScreenName, User_ user, Object geo, Object coordinates, Object place, Object contributors, boolean isQuoteStatus, long retweetCount, long favoriteCount, boolean favorited, boolean retweeted, boolean possiblySensitive, String lang) {
        super();
        this.createdAt = createdAt;
        this.id = id;
        this.idStr = idStr;
        this.text = text;
        this.truncated = truncated;
        this.entities = entities;
        this.metadata = metadata;
        this.source = source;
        this.inReplyToStatusId = inReplyToStatusId;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.inReplyToUserId = inReplyToUserId;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.inReplyToScreenName = inReplyToScreenName;
        this.user = user;
        this.geo = geo;
        this.coordinates = coordinates;
        this.place = place;
        this.contributors = contributors;
        this.isQuoteStatus = isQuoteStatus;
        this.retweetCount = retweetCount;
        this.favoriteCount = favoriteCount;
        this.favorited = favorited;
        this.retweeted = retweeted;
        this.possiblySensitive = possiblySensitive;
        this.lang = lang;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RetweetedStatus withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RetweetedStatus withId(long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public RetweetedStatus withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RetweetedStatus withText(String text) {
        this.text = text;
        return this;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public RetweetedStatus withTruncated(boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public Entities__ getEntities() {
        return entities;
    }

    public void setEntities(Entities__ entities) {
        this.entities = entities;
    }

    public RetweetedStatus withEntities(Entities__ entities) {
        this.entities = entities;
        return this;
    }

    public Metadata_ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata_ metadata) {
        this.metadata = metadata;
    }

    public RetweetedStatus withMetadata(Metadata_ metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RetweetedStatus withSource(String source) {
        this.source = source;
        return this;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public RetweetedStatus withInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
        return this;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public RetweetedStatus withInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        return this;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public RetweetedStatus withInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
        return this;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public RetweetedStatus withInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        return this;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public RetweetedStatus withInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
        return this;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public RetweetedStatus withUser(User_ user) {
        this.user = user;
        return this;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public RetweetedStatus withGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public RetweetedStatus withCoordinates(Object coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public RetweetedStatus withPlace(Object place) {
        this.place = place;
        return this;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public RetweetedStatus withContributors(Object contributors) {
        this.contributors = contributors;
        return this;
    }

    public boolean isIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public RetweetedStatus withIsQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
        return this;
    }

    public long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public RetweetedStatus withRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
        return this;
    }

    public long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public RetweetedStatus withFavoriteCount(long favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public RetweetedStatus withFavorited(boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public RetweetedStatus withRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public RetweetedStatus withPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public RetweetedStatus withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public String toString() {
        return "RetweetedStatus{" +
                "createdAt='" + createdAt + '\'' +
                ", id=" + id +
                ", idStr='" + idStr + '\'' +
                ", text='" + text + '\'' +
                ", truncated=" + truncated +
                ", entities=" + entities +
                ", metadata=" + metadata +
                ", source='" + source + '\'' +
                ", inReplyToStatusId=" + inReplyToStatusId +
                ", inReplyToStatusIdStr=" + inReplyToStatusIdStr +
                ", inReplyToUserId=" + inReplyToUserId +
                ", inReplyToUserIdStr=" + inReplyToUserIdStr +
                ", inReplyToScreenName=" + inReplyToScreenName +
                ", user=" + user +
                ", geo=" + geo +
                ", coordinates=" + coordinates +
                ", place=" + place +
                ", contributors=" + contributors +
                ", isQuoteStatus=" + isQuoteStatus +
                ", retweetCount=" + retweetCount +
                ", favoriteCount=" + favoriteCount +
                ", favorited=" + favorited +
                ", retweeted=" + retweeted +
                ", possiblySensitive=" + possiblySensitive +
                ", lang='" + lang + '\'' +
                '}';
    }
}
