package com.example.quad2.tweettaggrabber.ottoUtils;

import android.util.Log;

import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quad2 on 28/4/17.
 */

public class DataRefreshEvent {

    private List<Status> statuses = new ArrayList<>();

    public DataRefreshEvent(List<Status> statuses) {
        this.statuses = statuses;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }
}
