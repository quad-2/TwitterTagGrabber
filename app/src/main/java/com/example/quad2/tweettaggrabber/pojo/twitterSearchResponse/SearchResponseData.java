
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResponseData {

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
    public SearchResponseData() {
    }

    /**
     * 
     * @param searchMetadata
     * @param statuses
     */
    public SearchResponseData(List<Status> statuses, SearchMetadata searchMetadata) {
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

    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }

    @Override
    public String toString() {
        return "SearchResponseData{" +
                "statuses=" + statuses +
                ", searchMetadata=" + searchMetadata +
                '}';
    }
}
