package com.example.vladan.sampleimgurgallery.datamodel;

import com.example.vladan.sampleimgurgallery.api.model.GalleryImage;

public class GalleryImageDataModel {

    private String id;
    private int upVotes;
    private int downVotes;
    private String title;
    private String description;
    private String image;
    private int score;

    public GalleryImageDataModel(GalleryImage galleryImage) {
        id = galleryImage.getId();
        upVotes = galleryImage.getUps();
        downVotes = galleryImage.getDowns();
        title = galleryImage.getTitle();
        description = galleryImage.getDescription();
        score = galleryImage.getScore();
        String type = galleryImage.getType().equals("image/png") ? ".png" : ".jpg";
        image = galleryImage.getLink();
    }

    public String getId() {
        return id;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getScore() {
        return score;
    }
}
