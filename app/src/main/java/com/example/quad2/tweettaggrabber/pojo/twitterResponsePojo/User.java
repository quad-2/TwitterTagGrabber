
package com.example.quad2.tweettaggrabber.pojo.twitterResponsePojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("entities")
    @Expose
    private Entities_ entities;
    @SerializedName("protected")
    @Expose
    private boolean _protected;
    @SerializedName("followers_count")
    @Expose
    private long followersCount;
    @SerializedName("friends_count")
    @Expose
    private long friendsCount;
    @SerializedName("listed_count")
    @Expose
    private long listedCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("favourites_count")
    @Expose
    private long favouritesCount;
    @SerializedName("utc_offset")
    @Expose
    private Object utcOffset;
    @SerializedName("time_zone")
    @Expose
    private Object timeZone;
    @SerializedName("geo_enabled")
    @Expose
    private boolean geoEnabled;
    @SerializedName("verified")
    @Expose
    private boolean verified;
    @SerializedName("statuses_count")
    @Expose
    private long statusesCount;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("contributors_enabled")
    @Expose
    private boolean contributorsEnabled;
    @SerializedName("is_translator")
    @Expose
    private boolean isTranslator;
    @SerializedName("is_translation_enabled")
    @Expose
    private boolean isTranslationEnabled;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_tile")
    @Expose
    private boolean profileBackgroundTile;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("profile_banner_url")
    @Expose
    private String profileBannerUrl;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @SerializedName("profile_use_background_image")
    @Expose
    private boolean profileUseBackgroundImage;
    @SerializedName("has_extended_profile")
    @Expose
    private boolean hasExtendedProfile;
    @SerializedName("default_profile")
    @Expose
    private boolean defaultProfile;
    @SerializedName("default_profile_image")
    @Expose
    private boolean defaultProfileImage;
    @SerializedName("following")
    @Expose
    private Object following;
    @SerializedName("follow_request_sent")
    @Expose
    private Object followRequestSent;
    @SerializedName("notifications")
    @Expose
    private Object notifications;
    @SerializedName("translator_type")
    @Expose
    private String translatorType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param isTranslator
     * @param isTranslationEnabled
     * @param friendsCount
     * @param profileUseBackgroundImage
     * @param profileBackgroundColor
     * @param followRequestSent
     * @param location
     * @param profileBannerUrl
     * @param favouritesCount
     * @param screenName
     * @param hasExtendedProfile
     * @param profileImageUrl
     * @param timeZone
     * @param profileSidebarBorderColor
     * @param defaultProfileImage
     * @param lang
     * @param id
     * @param following
     * @param profileSidebarFillColor
     * @param description
     * @param createdAt
     * @param verified
     * @param name
     * @param contributorsEnabled
     * @param profileBackgroundImageUrlHttps
     * @param profileImageUrlHttps
     * @param listedCount
     * @param geoEnabled
     * @param entities
     * @param _protected
     * @param url
     * @param idStr
     * @param profileBackgroundTile
     * @param profileLinkColor
     * @param translatorType
     * @param notifications
     * @param followersCount
     * @param utcOffset
     * @param profileTextColor
     * @param profileBackgroundImageUrl
     * @param statusesCount
     * @param defaultProfile
     */
    public User(long id, String idStr, String name, String screenName, String location, String description, Object url, Entities_ entities, boolean _protected, long followersCount, long friendsCount, long listedCount, String createdAt, long favouritesCount, Object utcOffset, Object timeZone, boolean geoEnabled, boolean verified, long statusesCount, String lang, boolean contributorsEnabled, boolean isTranslator, boolean isTranslationEnabled, String profileBackgroundColor, String profileBackgroundImageUrl, String profileBackgroundImageUrlHttps, boolean profileBackgroundTile, String profileImageUrl, String profileImageUrlHttps, String profileBannerUrl, String profileLinkColor, String profileSidebarBorderColor, String profileSidebarFillColor, String profileTextColor, boolean profileUseBackgroundImage, boolean hasExtendedProfile, boolean defaultProfile, boolean defaultProfileImage, Object following, Object followRequestSent, Object notifications, String translatorType) {
        super();
        this.id = id;
        this.idStr = idStr;
        this.name = name;
        this.screenName = screenName;
        this.location = location;
        this.description = description;
        this.url = url;
        this.entities = entities;
        this._protected = _protected;
        this.followersCount = followersCount;
        this.friendsCount = friendsCount;
        this.listedCount = listedCount;
        this.createdAt = createdAt;
        this.favouritesCount = favouritesCount;
        this.utcOffset = utcOffset;
        this.timeZone = timeZone;
        this.geoEnabled = geoEnabled;
        this.verified = verified;
        this.statusesCount = statusesCount;
        this.lang = lang;
        this.contributorsEnabled = contributorsEnabled;
        this.isTranslator = isTranslator;
        this.isTranslationEnabled = isTranslationEnabled;
        this.profileBackgroundColor = profileBackgroundColor;
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        this.profileBackgroundTile = profileBackgroundTile;
        this.profileImageUrl = profileImageUrl;
        this.profileImageUrlHttps = profileImageUrlHttps;
        this.profileBannerUrl = profileBannerUrl;
        this.profileLinkColor = profileLinkColor;
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        this.profileSidebarFillColor = profileSidebarFillColor;
        this.profileTextColor = profileTextColor;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this.hasExtendedProfile = hasExtendedProfile;
        this.defaultProfile = defaultProfile;
        this.defaultProfileImage = defaultProfileImage;
        this.following = following;
        this.followRequestSent = followRequestSent;
        this.notifications = notifications;
        this.translatorType = translatorType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User withId(long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public User withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public User withScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public User withUrl(Object url) {
        this.url = url;
        return this;
    }

    public Entities_ getEntities() {
        return entities;
    }

    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    public User withEntities(Entities_ entities) {
        this.entities = entities;
        return this;
    }

    public boolean isProtected() {
        return _protected;
    }

    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    public User withProtected(boolean _protected) {
        this._protected = _protected;
        return this;
    }

    public long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(long followersCount) {
        this.followersCount = followersCount;
    }

    public User withFollowersCount(long followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    public long getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public User withFriendsCount(long friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }

    public long getListedCount() {
        return listedCount;
    }

    public void setListedCount(long listedCount) {
        this.listedCount = listedCount;
    }

    public User withListedCount(long listedCount) {
        this.listedCount = listedCount;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public long getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public User withFavouritesCount(long favouritesCount) {
        this.favouritesCount = favouritesCount;
        return this;
    }

    public Object getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    public User withUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    public User withTimeZone(Object timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public User withGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
        return this;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public User withVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public long getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public User withStatusesCount(long statusesCount) {
        this.statusesCount = statusesCount;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public User withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public User withContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
        return this;
    }

    public boolean isIsTranslator() {
        return isTranslator;
    }

    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public User withIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
        return this;
    }

    public boolean isIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    public void setIsTranslationEnabled(boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    public User withIsTranslationEnabled(boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
        return this;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public User withProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
        return this;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public User withProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        return this;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public User withProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        return this;
    }

    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public User withProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
        return this;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public User withProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public User withProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
        return this;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public User withProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
        return this;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public User withProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
        return this;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public User withProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        return this;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public User withProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
        return this;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public User withProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
        return this;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public User withProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        return this;
    }

    public boolean isHasExtendedProfile() {
        return hasExtendedProfile;
    }

    public void setHasExtendedProfile(boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
    }

    public User withHasExtendedProfile(boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
        return this;
    }

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public User withDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
        return this;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public User withDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
        return this;
    }

    public Object getFollowing() {
        return following;
    }

    public void setFollowing(Object following) {
        this.following = following;
    }

    public User withFollowing(Object following) {
        this.following = following;
        return this;
    }

    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public User withFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
        return this;
    }

    public Object getNotifications() {
        return notifications;
    }

    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    public User withNotifications(Object notifications) {
        this.notifications = notifications;
        return this;
    }

    public String getTranslatorType() {
        return translatorType;
    }

    public void setTranslatorType(String translatorType) {
        this.translatorType = translatorType;
    }

    public User withTranslatorType(String translatorType) {
        this.translatorType = translatorType;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", idStr='" + idStr + '\'' +
                ", name='" + name + '\'' +
                ", screenName='" + screenName + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", url=" + url +
                ", entities=" + entities +
                ", _protected=" + _protected +
                ", followersCount=" + followersCount +
                ", friendsCount=" + friendsCount +
                ", listedCount=" + listedCount +
                ", createdAt='" + createdAt + '\'' +
                ", favouritesCount=" + favouritesCount +
                ", utcOffset=" + utcOffset +
                ", timeZone=" + timeZone +
                ", geoEnabled=" + geoEnabled +
                ", verified=" + verified +
                ", statusesCount=" + statusesCount +
                ", lang='" + lang + '\'' +
                ", contributorsEnabled=" + contributorsEnabled +
                ", isTranslator=" + isTranslator +
                ", isTranslationEnabled=" + isTranslationEnabled +
                ", profileBackgroundColor='" + profileBackgroundColor + '\'' +
                ", profileBackgroundImageUrl='" + profileBackgroundImageUrl + '\'' +
                ", profileBackgroundImageUrlHttps='" + profileBackgroundImageUrlHttps + '\'' +
                ", profileBackgroundTile=" + profileBackgroundTile +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", profileImageUrlHttps='" + profileImageUrlHttps + '\'' +
                ", profileBannerUrl='" + profileBannerUrl + '\'' +
                ", profileLinkColor='" + profileLinkColor + '\'' +
                ", profileSidebarBorderColor='" + profileSidebarBorderColor + '\'' +
                ", profileSidebarFillColor='" + profileSidebarFillColor + '\'' +
                ", profileTextColor='" + profileTextColor + '\'' +
                ", profileUseBackgroundImage=" + profileUseBackgroundImage +
                ", hasExtendedProfile=" + hasExtendedProfile +
                ", defaultProfile=" + defaultProfile +
                ", defaultProfileImage=" + defaultProfileImage +
                ", following=" + following +
                ", followRequestSent=" + followRequestSent +
                ", notifications=" + notifications +
                ", translatorType='" + translatorType + '\'' +
                '}';
    }
}
