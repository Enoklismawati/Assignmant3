package com.example.assignment_3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://corona.lmao.ninja/v2/";
    @GET("all")
    Call<List<Result>> getCases();
}
