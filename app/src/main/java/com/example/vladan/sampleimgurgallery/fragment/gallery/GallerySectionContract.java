package com.example.vladan.sampleimgurgallery.fragment.gallery;

import android.os.Bundle;

import com.example.vladan.sampleimgurgallery.datamodel.GalleryImageDataModel;

import java.util.List;

public interface GallerySectionContract {

    interface View {
        void showImages(List<GalleryImageDataModel> images);
        void showNoInternetConnection();
        void showError(String error);
    }

    interface Presenter {
        void setView(View view);
        void setData(int type, boolean showViral);
        void getHotSection();
        void getTopSection();
        void getUserSection();
        void showViralImages(boolean show);
        void saveInstanceState(Bundle bundle);
        void getWindowDay();
        void getWindowWeek();
        void getWindowMonth();
        void getWindowYear();
        void getWindowAll();
        void getSortTop();
        void getSortViral();
        void getSortRising();
        void getSortTime();
    }
}
