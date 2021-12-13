package com.example.vladan.sampleimgurgallery.api.request.windowRequest;

import java.util.HashMap;

public class WindowYearRequest extends HashMap<String, Object> {

    public WindowYearRequest() { super(); }

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

        public WindowYearRequest build() {

            WindowYearRequest request = new WindowYearRequest();
            request.setViral(viral);
            return request;
        }
    }
}
