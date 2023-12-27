package com.cso.mobile.components.services

import com.cso.mobile.features.armada.model.ArmadaJadwalResponseModel
import com.cso.mobile.features.tiket.model.TiketItemResponseModel
import com.cso.mobile.features.tiket.model.TiketResponseModel
import retrofit2.http.GET

interface ApiService {
    @GET("/jadwal.json")
    suspend fun getJadwal(): ArmadaJadwalResponseModel

    @GET("/jadwal-asal.json")
    suspend fun getJadwalAsal(): TiketResponseModel

    @GET("/jadwal-tujuan.json")
    suspend fun getJadwalTujuan(): TiketItemResponseModel
}