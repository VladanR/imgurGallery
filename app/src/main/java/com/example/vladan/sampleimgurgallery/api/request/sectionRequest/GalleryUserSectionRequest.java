package com.example.vladan.sampleimgurgallery.api.request.sectionRequest;

import java.util.HashMap;

public class GalleryUserSectionRequest extends HashMap<String, Object> {

    public GalleryUserSectionRequest() {
        super();
    }

    private void setViral(boolean viral) {
        put("showViral", viral);
    }

    public static class Builder{

        private boolean viral;

        public Builder() {}

        public Builder setViral(boolean viral) {
            this.viral = viral;
            return this;
        }

        public GalleryUserSectionRequest build() {

            GalleryUserSectionRequest request = new GalleryUserSectionRequest();
            request.setViral(viral);
            return request;
        }
    }
}
