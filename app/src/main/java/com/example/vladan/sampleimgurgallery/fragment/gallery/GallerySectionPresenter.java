package com.example.vladan.sampleimgurgallery.fragment.gallery;

import android.os.Bundle;

import com.example.vladan.sampleimgurgallery.api.ApiClient;
import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryHotSectionRequest;
import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryTopSectionRequest;
import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryUserSectionRequest;
import com.example.vladan.sampleimgurgallery.api.ImgurService;
import com.example.vladan.sampleimgurgallery.api.model.Data;
import com.example.vladan.sampleimgurgallery.api.model.GalleryImage;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowAllRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowDayRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowMonthRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowWeekRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowYearRequest;
import com.example.vladan.sampleimgurgallery.api.response.GalleryResponse;
import com.example.vladan.sampleimgurgallery.datamodel.GalleryImageDataModel;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.HOT_SECTION;
import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.TOP_SECTION;
import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.USER_SECTION;

public class GallerySectionPresenter implements GallerySectionContract.Presenter {

    public static final String EXTRA_VIRAL = "EXTRA_VIRAL";
    public static final String EXTRA_TYPE = "EXTRA_TYPE";

    private GallerySectionContract.View view;
    private ImgurService apiInterface;
    private boolean showViralImages;
    private int type;

    public GallerySectionPresenter() {
        Retrofit retrofit = ApiClient.getClient();
        apiInterface = retrofit.create(ImgurService.class);
        showViralImages = true;
    }

    @Override
    public void setView(GallerySectionContract.View view) {
        this.view = view;
    }

    @Override
    public void setData(int type, boolean showViral) {
        this.type = type;
        this.showViralImages = showViral;
        loadImages();
    }

    private void loadImages() {
        if (type == HOT_SECTION){
            getHotSection();
        } else if (type == TOP_SECTION) {
            getTopSection();
        } else if (type == USER_SECTION){
            getUserSection();
        }
    }

    @Override
    public void getTopSection() {
        GalleryTopSectionRequest request = new GalleryTopSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getTopSection(request);
        executeCall(call);
    }

    @Override
    public void getUserSection() {
        GalleryUserSectionRequest request = new GalleryUserSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getUserSection(request);
        executeCall(call);
    }

    @Override
    public void showViralImages(boolean show) {
        this.showViralImages = show;
        loadImages();
    }

    @Override
    public void getHotSection() {
        GalleryHotSectionRequest request = new GalleryHotSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getHotSection(request);
        executeCall(call);
    }

    private void executeCall(Call<GalleryResponse> call) {
        call.enqueue(new Callback<GalleryResponse>() {
            @Override
            public void onResponse(Call<GalleryResponse> call, Response<GalleryResponse> response) {
                if (view == null) return;

                if (response.isSuccessful()) {
                    GalleryResponse galleryResponse = response.body();
                    List<Data> data = galleryResponse.getData();
                    List<GalleryImageDataModel> dataModels = new ArrayList<>();
                    for (int i = 0; i < data.size(); i++) {
                        List<GalleryImage> images = data.get(i).getImages();
                        if (images == null) continue;
                        for (GalleryImage image : images) {
                            if (!image.getIsAlbum()) {
                                dataModels.add(new GalleryImageDataModel(image));
                            }
                        }
                    }
                    view.showImages(dataModels);
                } else {
                    try {
                        String error = response.errorBody().string();
                        view.showError(error);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<GalleryResponse> call, Throwable t) {
                if (view == null) return;

                if (t instanceof UnknownHostException) {
                    view.showNoInternetConnection();
                } else {
                    view.showError(t.getLocalizedMessage());
                }
            }
        });
    }

    @Override
    public void saveInstanceState(Bundle bundle) {
        bundle.putBoolean(EXTRA_VIRAL, showViralImages);
        bundle.putInt(EXTRA_TYPE, type);
    }

    @Override
    public void getWindowDay() {
        WindowDayRequest request = new WindowDayRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getDayWindow(request);
        executeCall(call);
    }

    @Override
    public void getWindowWeek() {
        WindowWeekRequest request = new WindowWeekRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getWeekWindow(request);
        executeCall(call);
    }

    @Override
    public void getWindowMonth() {
        WindowMonthRequest request = new WindowMonthRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getMonthWindow(request);
        executeCall(call);
    }

    @Override
    public void getWindowYear() {
        WindowYearRequest request = new WindowYearRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getYearWindow(request);
        executeCall(call);
    }

    @Override
    public void getWindowAll() {
        WindowAllRequest request = new WindowAllRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getAllWindow(request);
        executeCall(call);
    }

    @Override
    public void getSortTop() {
        GalleryHotSectionRequest request = new GalleryHotSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getHotSection(request);
        executeCall(call);
    }

    @Override
    public void getSortViral() {
        GalleryHotSectionRequest request = new GalleryHotSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getHotSection(request);
        executeCall(call);
    }

    @Override
    public void getSortRising() {
        GalleryHotSectionRequest request = new GalleryHotSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getHotSection(request);
        executeCall(call);
    }

    @Override
    public void getSortTime() {
        GalleryHotSectionRequest request = new GalleryHotSectionRequest.Builder()
                .setViral(showViralImages)
                .build();
        Call<GalleryResponse> call = apiInterface.getHotSection(request);
        executeCall(call);
    }
}
