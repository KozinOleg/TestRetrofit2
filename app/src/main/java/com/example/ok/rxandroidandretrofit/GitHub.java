package com.example.ok.rxandroidandretrofit;


import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHub {

    @GET("/repos/{owner}/{repo}/contributors")
    Call<ResponseBody> contributorsString(
            @Path("owner") String owner,
            @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> contributorsObject(
            @Path("owner") String owner,
            @Path("repo") String repo);
}
