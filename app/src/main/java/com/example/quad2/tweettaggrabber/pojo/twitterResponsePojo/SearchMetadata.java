
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchMetadata {

    @SerializedName("completed_in")
    @Expose
    private double completedIn;
    @SerializedName("max_id")
    @Expose
    private long maxId;
    @SerializedName("max_id_str")
    @Expose
    private String maxIdStr;
    @SerializedName("next_results")
    @Expose
    private String nextResults;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("refresh_url")
    @Expose
    private String refreshUrl;
    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("since_id")
    @Expose
    private long sinceId;
    @SerializedName("since_id_str")
    @Expose
    private String sinceIdStr;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchMetadata() {
    }

    /**
     * 
     * @param sinceId
     * @param count
     * @param query
     * @param maxIdStr
     * @param sinceIdStr
     * @param refreshUrl
     * @param completedIn
     * @param nextResults
     * @param maxId
     */
    public SearchMetadata(double completedIn, long maxId, String maxIdStr, String nextResults, String query, String refreshUrl, long count, long sinceId, String sinceIdStr) {
        super();
        this.completedIn = completedIn;
        this.maxId = maxId;
        this.maxIdStr = maxIdStr;
        this.nextResults = nextResults;
        this.query = query;
        this.refreshUrl = refreshUrl;
        this.count = count;
        this.sinceId = sinceId;
        this.sinceIdStr = sinceIdStr;
    }

    public double getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(double completedIn) {
        this.completedIn = completedIn;
    }

    public SearchMetadata withCompletedIn(double completedIn) {
        this.completedIn = completedIn;
        return this;
    }

    public long getMaxId() {
        return maxId;
    }

    public void setMaxId(long maxId) {
        this.maxId = maxId;
    }

    public SearchMetadata withMaxId(long maxId) {
        this.maxId = maxId;
        return this;
    }

    public String getMaxIdStr() {
        return maxIdStr;
    }

    public void setMaxIdStr(String maxIdStr) {
        this.maxIdStr = maxIdStr;
    }

    public SearchMetadata withMaxIdStr(String maxIdStr) {
        this.maxIdStr = maxIdStr;
        return this;
    }

    public String getNextResults() {
        return nextResults;
    }

    public void setNextResults(String nextResults) {
        this.nextResults = nextResults;
    }

    public SearchMetadata withNextResults(String nextResults) {
        this.nextResults = nextResults;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public SearchMetadata withQuery(String query) {
        this.query = query;
        return this;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public SearchMetadata withRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
        return this;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public SearchMetadata withCount(long count) {
        this.count = count;
        return this;
    }

    public long getSinceId() {
        return sinceId;
    }

    public void setSinceId(long sinceId) {
        this.sinceId = sinceId;
    }

    public SearchMetadata withSinceId(long sinceId) {
        this.sinceId = sinceId;
        return this;
    }

    public String getSinceIdStr() {
        return sinceIdStr;
    }

    public void setSinceIdStr(String sinceIdStr) {
        this.sinceIdStr = sinceIdStr;
    }

    public SearchMetadata withSinceIdStr(String sinceIdStr) {
        this.sinceIdStr = sinceIdStr;
        return this;
    }

    @Override
    public String toString() {
        return "SearchMetadata{" +
                "completedIn=" + completedIn +
                ", maxId=" + maxId +
                ", maxIdStr='" + maxIdStr + '\'' +
                ", nextResults='" + nextResults + '\'' +
                ", query='" + query + '\'' +
                ", refreshUrl='" + refreshUrl + '\'' +
                ", count=" + count +
                ", sinceId=" + sinceId +
                ", sinceIdStr='" + sinceIdStr + '\'' +
                '}';
    }
}
