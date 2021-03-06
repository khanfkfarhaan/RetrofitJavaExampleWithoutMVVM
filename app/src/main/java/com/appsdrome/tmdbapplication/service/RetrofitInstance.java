package com.appsdrome.tmdbapplication.service;
import com.appsdrome.tmdbapplication.service.MovieDbService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance  {
    private static Retrofit retrofit = null;
    private static String BASE_URL ="https://api.themoviedb.org/3/";

    public static MovieDbService getMovieData(){

        if(retrofit == null){

            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit.create(MovieDbService.class);
    }
}
