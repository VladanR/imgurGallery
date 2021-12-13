package com.example.vladan.sampleimgurgallery.api.request.sortRequest;

import java.util.HashMap;

public class SortRisingRequest extends HashMap<String, Object> {

    public SortRisingRequest() { super(); }

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

        public SortRisingRequest build() {

            SortRisingRequest request = new SortRisingRequest();
            request.setViral(viral);
            return request;
        }
    }
}
