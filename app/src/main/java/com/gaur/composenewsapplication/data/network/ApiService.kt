package com.gaur.composenewsapplication.data.network

import com.gaur.composenewsapplication.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // https://newsapi.org/v2/top-headlines?country=us&apiKey=436a7b507ee5433bafa1ad67c8eff93b

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country:String="us",
        @Query("apiKey") apiKey:String="436a7b507ee5433bafa1ad67c8eff93b"
    ):Response<NewsDTO>



}