package com.example.vladan.sampleimgurgallery.api.request.sortRequest;

import java.util.HashMap;

public class SortViralRequest extends HashMap<String, Object> {

    public SortViralRequest() { super(); }

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

        public SortViralRequest build() {

            SortViralRequest request = new SortViralRequest();
            request.setViral(viral);
            return request;
        }
    }
}
