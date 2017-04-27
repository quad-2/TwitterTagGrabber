
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata_ {

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
    public Metadata_() {
    }

    /**
     * 
     * @param resultType
     * @param isoLanguageCode
     */
    public Metadata_(String isoLanguageCode, String resultType) {
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

    public Metadata_ withIsoLanguageCode(String isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
        return this;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Metadata_ withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    @Override
    public String toString() {
        return "Metadata_{" +
                "isoLanguageCode='" + isoLanguageCode + '\'' +
                ", resultType='" + resultType + '\'' +
                '}';
    }
}
