package com.example.dust.data.service

import com.example.dust.BuildConfig
import com.example.dust.data.service.models.tmcoordinates.monitoringstation.MonitoringStationsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AirKoreaApiService {

    @GET("B552584/MsrstnInfoInqireSvc/getMsrstnList" +
        "?serviceKey=${BuildConfig.AIR_KOREA_SERVICE_KEY}" +
        "&returnType=json")
    suspend fun getNearbyMonitoringStation(
        @Query("tmX") tmX: Double,
        @Query("tmY") tmY: Double
    ): Response<MonitoringStationsResponse>
}