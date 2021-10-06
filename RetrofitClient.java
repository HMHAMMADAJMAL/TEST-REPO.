package com.example.retrofitrecyclerhorvercompaginscreen;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitClient {

    private static RetrofitClient instance = null;
    private PlaceHolderApi myApi;

    String BASE_URL = "https://sadaqahnz.pythonanywhere.com/";
    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(PlaceHolderApi.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public PlaceHolderApi getMyApi() {
        return myApi;
    }
}