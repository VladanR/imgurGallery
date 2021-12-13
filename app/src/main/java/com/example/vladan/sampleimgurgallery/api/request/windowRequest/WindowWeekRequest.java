package com.example.vladan.sampleimgurgallery.api.request.windowRequest;

import java.util.HashMap;

public class WindowWeekRequest extends HashMap<String, Object> {

    public WindowWeekRequest() { super(); }

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

        public WindowWeekRequest build() {

            WindowWeekRequest request = new WindowWeekRequest();
            request.setViral(viral);
            return request;
        }
    }
}
