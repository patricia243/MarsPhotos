package com.example.marsphotos.netWork

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

class MarsApiService {
    private val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    interface MarsApiService {
        @GET("photos")
        fun getPhotos(): String
    }
}



