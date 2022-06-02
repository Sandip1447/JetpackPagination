package com.freecodecloud.jetpackpagination.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
class RetroInstance {

    companion object {
        val baseURL = "https://rickandmortyapi.com/api/"

        fun getRetroInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }
    }
}