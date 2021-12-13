package com.example.vladan.sampleimgurgallery.api.request.sectionRequest;

import java.util.HashMap;

public class GalleryTopSectionRequest extends HashMap<String, Object> {

    public GalleryTopSectionRequest() {
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

        public GalleryTopSectionRequest build() {

            GalleryTopSectionRequest request = new GalleryTopSectionRequest();
            request.setViral(viral);
            return request;
        }
    }
}
