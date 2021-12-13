package com.example.vladan.sampleimgurgallery.api.request.windowRequest;

import java.util.HashMap;

public class WindowDayRequest extends HashMap<String, Object> {

    public WindowDayRequest() { super(); }

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

        public WindowDayRequest build() {

            WindowDayRequest request = new WindowDayRequest();
            request.setViral(viral);
            return request;
        }
    }
}
