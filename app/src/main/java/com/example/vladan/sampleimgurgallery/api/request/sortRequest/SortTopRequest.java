package com.example.vladan.sampleimgurgallery.api.request.sortRequest;

import java.util.HashMap;

public class SortTopRequest extends HashMap<String, Object> {

    public SortTopRequest() { super(); }

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

        public SortTopRequest build() {

            SortTopRequest request = new SortTopRequest();
            request.setViral(viral);
            return request;
        }
    }
}
