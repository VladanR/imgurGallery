package com.example.vladan.sampleimgurgallery.api.model;

import com.google.gson.annotations.SerializedName;

public class Processing {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
