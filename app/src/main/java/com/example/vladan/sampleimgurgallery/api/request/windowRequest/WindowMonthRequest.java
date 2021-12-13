package com.example.vladan.sampleimgurgallery.api.request.windowRequest;

import java.util.HashMap;

public class WindowMonthRequest extends HashMap<String, Object> {

    public WindowMonthRequest() { super(); }

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

        public WindowMonthRequest build() {

            WindowMonthRequest request = new WindowMonthRequest();
            request.setViral(viral);
            return request;
        }
    }
}
