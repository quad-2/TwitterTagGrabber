
package com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("iso_language_code")
    @Expose
    private String isoLanguageCode;
    @SerializedName("result_type")
    @Expose
    private String resultType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param resultType
     * @param isoLanguageCode
     */
    public Metadata(String isoLanguageCode, String resultType) {
        super();
        this.isoLanguageCode = isoLanguageCode;
        this.resultType = resultType;
    }

    public String getIsoLanguageCode() {
        return isoLanguageCode;
    }

    public void setIsoLanguageCode(String isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "isoLanguageCode='" + isoLanguageCode + '\'' +
                ", resultType='" + resultType + '\'' +
                '}';
    }
}
