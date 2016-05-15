package com.example.ok.rxandroidandretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    /*
    * http://www.jsonschema2pojo.org/
    * https://medium.com/@ahmedrizwan/rxandroid-and-retrofit-2-0-66dc52725fff#.nqgfs9mth
    * http://codeentries.com/libraries/how-to-use-retrofit-2-in-android-the-example.html
    *
    * http://zeroturnaround.com/rebellabs/getting-started-with-retrofit-2/
    * */
    public static final String API_URL = "https://api.github.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit.create(GitHub.class).contributorsString("square", "retrofit").enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.body() + "\n");
                    System.out.println(response.code() + "\n");
                    System.out.println(response.headers() + "\n");
                    System.out.println(response.message() + "\n");
                    System.out.println(response.raw() + "\n");

                } else {
                    System.out.println(response.errorBody().toString() + "\n");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println();
            }
        });


        retrofit.create(GitHub.class).contributorsObject("square", "retrofit").enqueue(new Callback<List<Contributor>>() {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                System.out.println();
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable t) {
                System.out.println();
            }
        });
    }
}
