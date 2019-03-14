package com.example.lifeline.rest_api;

import com.example.lifeline.models.DetailResult;
import com.example.lifeline.models.DistanceResult;
import com.example.lifeline.models.PlaceList;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;



public interface HospitalListClient {

    @GET("place/nearbysearch/json")
    public abstract Call<PlaceList> getNearbyHospitals (@QueryMap Map<String, String> params);

    @GET("distancematrix/json")
    public abstract Call<DistanceResult> getHospitalDistances(@QueryMap Map<String, String> params);

    @GET("place/details/json")
    public abstract Call<DetailResult> getHospitalDetails(@QueryMap Map<String, String> params);
}
