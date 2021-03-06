package com.example.retrofitrecyclerhorvercompaginscreen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface PlaceHolderApi {

    @GET("campaigns")
    Call<List<ModelVer>> getPostsData();
}
