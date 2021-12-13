package com.example.vladan.sampleimgurgallery.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("datetime")
    private Integer datetime;
    @SerializedName("cover")
    private String cover;
    @SerializedName("cover_width")
    private Integer coverWidth;
    @SerializedName("cover_height")
    private Integer coverHeight;
    @SerializedName("account_url")
    private String accountUrl;
    @SerializedName("account_id")
    private Integer accountId;
    @SerializedName("privacy")
    private String privacy;
    @SerializedName("layout")
    private String layout;
    @SerializedName("views")
    private Integer views;
    @SerializedName("link")
    private String link;
    @SerializedName("ups")
    private Integer ups;
    @SerializedName("downs")
    private Integer downs;
    @SerializedName("points")
    private Integer points;
    @SerializedName("score")
    private Integer score;
    @SerializedName("is_album")
    private Boolean isAlbum;
    @SerializedName("vote")
    private Object vote;
    @SerializedName("favorite")
    private Boolean favorite;
    @SerializedName("nsfw")
    private Boolean nsfw;
    @SerializedName("section")
    private String section;
    @SerializedName("comment_count")
    private Integer commentCount;
    @SerializedName("favorite_count")
    private Integer favoriteCount;
    @SerializedName("topic")
    private String topic;
    @SerializedName("topic_id")
    private Integer topicId;
    @SerializedName("images_count")
    private Integer imagesCount;
    @SerializedName("in_gallery")
    private Boolean inGallery;
    @SerializedName("is_ad")
    private Boolean isAd;
    @SerializedName("tags")
    private List<Tag> tags = null;
    @SerializedName("ad_type")
    private Integer adType;
    @SerializedName("ad_url")
    private String adUrl;
    @SerializedName("in_most_viral")
    private Boolean inMostViral;
    @SerializedName("include_album_ads")
    private Boolean includeAlbumAds;
    @SerializedName("images")
    private List<GalleryImage> images = null;
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
    @SerializedName("bandwidth")
    private Long bandwidth;
    @SerializedName("has_sound")
    private Boolean hasSound;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getCoverWidth() {
        return coverWidth;
    }

    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    public Integer getCoverHeight() {
        return coverHeight;
    }

    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
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

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Integer getDowns() {
        return downs;
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
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getIsAlbum() {
        return isAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
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

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
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

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getIncludeAlbumAds() {
        return includeAlbumAds;
    }

    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        this.includeAlbumAds = includeAlbumAds;
    }

    public List<GalleryImage> getImages() {
        return images;
    }

    public void setImages(List<GalleryImage> images) {
        this.images = images;
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

    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }
}
