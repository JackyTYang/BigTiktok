package com.bytedance.minitiktok.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response_GET {

    @SerializedName("feeds") private List<Video> Videos;
    @SerializedName("success") private boolean success;

    public List<Video> getVideos() { return Videos;}
    public boolean getSuccess() { return success; }

}
