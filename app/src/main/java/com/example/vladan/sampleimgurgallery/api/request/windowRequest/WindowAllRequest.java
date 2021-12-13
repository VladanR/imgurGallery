package com.example.vladan.sampleimgurgallery.api.request.windowRequest;

import java.util.HashMap;

public class WindowAllRequest extends HashMap<String, Object> {

    public WindowAllRequest() { super(); }

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

        public WindowAllRequest build() {

            WindowAllRequest request = new WindowAllRequest();
            request.setViral(viral);
            return request;
        }
    }
}
