package com.example.lifeline.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;



@Parcel
public class PlaceList {

    @SerializedName("next_page_token")
    String nextPageToken;

    @SerializedName("results")
    public ArrayList<SinglePlace> places;

    public PlaceList(){}


    public PlaceList(String nextPageToken, ArrayList<SinglePlace> places) {
        this.nextPageToken = nextPageToken;
        this.places = places;
    }


}
