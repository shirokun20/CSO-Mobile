package com.cso.mobile.components.services

import retrofit2.http.GET

interface ApiService {
    @GET("/jadwal.json")
    suspend fun getJadwal(): String

    @GET("/jadwal-asal.json")
    suspend fun getJadwalAsal(): String

    @GET("/jadwal-tujuan.json")
    suspend fun getJadwalTujuan(): String
}