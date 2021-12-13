package com.example.vladan.sampleimgurgallery.api.request.sectionRequest;

import java.util.HashMap;

public class GalleryHotSectionRequest extends HashMap<String, Object> {

    public GalleryHotSectionRequest() {
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

        public GalleryHotSectionRequest build() {

            GalleryHotSectionRequest request = new GalleryHotSectionRequest();
            request.setViral(viral);
            return request;
        }
    }
}
