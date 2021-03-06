package com.example.vladan.sampleimgurgallery.api.model;

import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("name")
    private String name;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("followers")
    private Integer followers;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("following")
    private Boolean following;

    @SerializedName("background_hash")
    private String backgroundHash;

    @SerializedName("thumbnail_hash")
    private Object thumbnailHash;

    @SerializedName("accent")
    private String accent;

    @SerializedName("background_is_animated")
    private Boolean backgroundIsAnimated;

    @SerializedName("thumbnail_is_animated")
    private Boolean thumbnailIsAnimated;

    @SerializedName("is_promoted")
    private Boolean isPromoted;

    @SerializedName("description")
    private String description;

    @SerializedName("logo_hash")
    private Object logoHash;

    @SerializedName("logo_destination_url")
    private Object logoDestinationUrl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public String getBackgroundHash() {
        return backgroundHash;
    }

    public void setBackgroundHash(String backgroundHash) {
        this.backgroundHash = backgroundHash;
    }

    public Object getThumbnailHash() {
        return thumbnailHash;
    }

    public void setThumbnailHash(Object thumbnailHash) {
        this.thumbnailHash = thumbnailHash;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public Boolean getBackgroundIsAnimated() {
        return backgroundIsAnimated;
    }

    public void setBackgroundIsAnimated(Boolean backgroundIsAnimated) {
        this.backgroundIsAnimated = backgroundIsAnimated;
    }

    public Boolean getThumbnailIsAnimated() {
        return thumbnailIsAnimated;
    }

    public void setThumbnailIsAnimated(Boolean thumbnailIsAnimated) {
        this.thumbnailIsAnimated = thumbnailIsAnimated;
    }

    public Boolean getIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getLogoHash() {
        return logoHash;
    }

    public void setLogoHash(Object logoHash) {
        this.logoHash = logoHash;
    }

    public Object getLogoDestinationUrl() {
        return logoDestinationUrl;
    }

    public void setLogoDestinationUrl(Object logoDestinationUrl) {
        this.logoDestinationUrl = logoDestinationUrl;
    }
}
