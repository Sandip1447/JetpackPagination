package com.freecodecloud.jetpackpagination.data.remote

import com.freecodecloud.jetpackpagination.data.model.RickMortyResponse
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
interface RetroService {

    @GET("character")
    suspend fun getDataFromAPI(@Query("page") query: Int): RickMortyResponse

}