
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiResponse {

    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = null;
    @SerializedName("search_metadata")
    @Expose
    private SearchMetadata searchMetadata;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiResponse() {
    }

    /**
     * 
     * @param searchMetadata
     * @param statuses
     */
    public ApiResponse(List<Status> statuses, SearchMetadata searchMetadata) {
        super();
        this.statuses = statuses;
        this.searchMetadata = searchMetadata;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public ApiResponse withStatuses(List<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }

    public ApiResponse withSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
        return this;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "statuses=" + statuses +
                ", searchMetadata=" + searchMetadata +
                '}';
    }
}
