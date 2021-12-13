package com.example.vladan.sampleimgurgallery.api;

import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryHotSectionRequest;
import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryTopSectionRequest;
import com.example.vladan.sampleimgurgallery.api.request.sectionRequest.GalleryUserSectionRequest;
import com.example.vladan.sampleimgurgallery.api.request.sortRequest.SortRisingRequest;
import com.example.vladan.sampleimgurgallery.api.request.sortRequest.SortTimeRequest;
import com.example.vladan.sampleimgurgallery.api.request.sortRequest.SortTopRequest;
import com.example.vladan.sampleimgurgallery.api.request.sortRequest.SortViralRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowAllRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowDayRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowMonthRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowWeekRequest;
import com.example.vladan.sampleimgurgallery.api.request.windowRequest.WindowYearRequest;
import com.example.vladan.sampleimgurgallery.api.response.GalleryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

public interface ImgurService {

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("hot")
    Call<GalleryResponse> getHotSection(@QueryMap GalleryHotSectionRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top")
    Call<GalleryResponse> getTopSection(@QueryMap GalleryTopSectionRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("user")
    Call<GalleryResponse> getUserSection(@QueryMap GalleryUserSectionRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("user/viral")
    Call<GalleryResponse> getViralSort(@QueryMap SortViralRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("user/top")
    Call<GalleryResponse> getTopSort(@QueryMap SortTopRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("user/time")
    Call<GalleryResponse> getTimeSort(@QueryMap SortTimeRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("user/rising")
    Call<GalleryResponse> getRisingSort(@QueryMap SortRisingRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top/day")
    Call<GalleryResponse> getDayWindow(@QueryMap WindowDayRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top/week")
    Call<GalleryResponse> getWeekWindow(@QueryMap WindowWeekRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top/month")
    Call<GalleryResponse> getMonthWindow(@QueryMap WindowMonthRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top/year")
    Call<GalleryResponse> getYearWindow(@QueryMap WindowYearRequest request);

    @Headers("Authorization:Client-ID 0b01ee5169692cb")
    @GET("top/all")
    Call<GalleryResponse> getAllWindow(@QueryMap WindowAllRequest request);
}
