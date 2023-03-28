package com.elizabeth.horoscopo.data.network

import com.elizabeth.horoscopo.data.model.HoroscopeResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface HoroscopeApi {
    @POST(".")
    suspend fun getHoroscope(
        @Query("sign")  sign : String,
        @Query("day")   day : String
    ) : Response<HoroscopeResponse>

}