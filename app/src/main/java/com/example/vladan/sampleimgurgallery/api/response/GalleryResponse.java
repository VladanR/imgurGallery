package com.example.vladan.sampleimgurgallery.api.response;

import com.example.vladan.sampleimgurgallery.api.model.Data;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryResponse {
    @SerializedName("data")
    public List<Data> data = null;

    @SerializedName("status")
    public int status;

    @SerializedName("success")
    public boolean success;

    public List<Data> getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public boolean isSuccess() {
        return success;
    }
}
