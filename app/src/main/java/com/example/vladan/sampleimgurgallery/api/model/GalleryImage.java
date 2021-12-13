package com.example.vladan.sampleimgurgallery.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryImage {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("datetime")
    private Integer datetime;

    @SerializedName("type")
    private String type;

    @SerializedName("animated")
    private Boolean animated;

    @SerializedName("width")
    private Integer width;

    @SerializedName("height")
    private Integer height;

    @SerializedName("size")
    private Integer size;

    @SerializedName("views")
    private Integer views;

    @SerializedName("bandwidth")
    private Long bandwidth;

    @SerializedName("vote")
    private Object vote;

    @SerializedName("favorite")
    private Boolean favorite;

    @SerializedName("nsfw")
    private Boolean nsfw;

    @SerializedName("section")
    private String section;

    @SerializedName("account_url")
    private String accountUrl;

    @SerializedName("account_id")
    private Integer accountId;

    @SerializedName("is_ad")
    private Boolean isAd;

    @SerializedName("in_most_viral")
    private Boolean inMostViral;

    @SerializedName("has_sound")
    private Boolean hasSound;

    @SerializedName("tags")
    private List<Tag> tags = null;

    @SerializedName("ad_type")
    private Integer adType;

    @SerializedName("ad_url")
    private String adUrl;

    @SerializedName("in_gallery")
    private Boolean inGallery;

    @SerializedName("topic")
    private String topic;

    @SerializedName("topic_id")
    private Integer topicId;

    @SerializedName("link")
    private String link;

    @SerializedName("mp4")
    private String mp4;

    @SerializedName("gifv")
    private String gifv;

    @SerializedName("mp4_size")
    private Integer mp4Size;

    @SerializedName("looping")
    private Boolean looping;

    @SerializedName("processing")
    private Processing processing;

    @SerializedName("comment_count")
    private Integer commentCount;

    @SerializedName("favorite_count")
    private Integer favoriteCount;

    @SerializedName("ups")
    private Integer ups;

    @SerializedName("downs")
    private Integer downs;

    @SerializedName("points")
    private Integer points;

    @SerializedName("score")
    private Integer score;

    @SerializedName("is_album")
    private boolean isAlbum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAnimated() {
        return animated;
    }

    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getGifv() {
        return gifv;
    }

    public void setGifv(String gifv) {
        this.gifv = gifv;
    }

    public Integer getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(Integer mp4Size) {
        this.mp4Size = mp4Size;
    }

    public Boolean getLooping() {
        return looping;
    }

    public void setLooping(Boolean looping) {
        this.looping = looping;
    }

    public Processing getProcessing() {
        return processing;
    }

    public void setProcessing(Processing processing) {
        this.processing = processing;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public int getUps() {
        return ups == null ? 0 : ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public int getDowns() {
        return downs == null ? 0 : downs;
    }

    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getScore() {
        return score == null ? 0 : score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public boolean getIsAlbum() {
        return isAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

}
