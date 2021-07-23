package com.bytedance.minitiktok;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

import com.bytedance.minitiktok.model.Response_GET;
import com.bytedance.minitiktok.model.Response_POST;

public interface IApi {
    String PATH_POST="video";
    String PATH_GET="video";

    @Multipart
    @POST(PATH_POST)
    Call<Response_POST> postVideo(
            @Query("student_id")String studentId,
            @Query("user_name") String userName,
            @Query("extra_value") String extraValue,
            @Part MultipartBody.Part coverImage,
            @Part MultipartBody.Part video,
            @Header("token")    String token);

    @GET(PATH_GET)
    Call<Response_GET> getVideo();
}