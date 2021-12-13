package com.example.vladan.sampleimgurgallery.api.request.sortRequest;

import java.util.HashMap;

public class SortTimeRequest extends HashMap<String, Object> {

    public SortTimeRequest() { super(); }

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

        public SortTimeRequest build() {

            SortTimeRequest request = new SortTimeRequest();
            request.setViral(viral);
            return request;
        }
    }
}
