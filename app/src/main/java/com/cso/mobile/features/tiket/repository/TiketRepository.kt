package com.cso.mobile.features.tiket.repository

import com.cso.mobile.components.instances.RetrofitInstance
import com.cso.mobile.features.tiket.model.TiketItemResponseModel
import com.cso.mobile.features.tiket.model.TiketResponseModel

class TiketRepository {
    private val apiService = RetrofitInstance.apiService
    suspend fun getJadwalAsal(): TiketResponseModel {
        return apiService.getJadwalAsal()
    }

    suspend fun getJadwalTujuan(): TiketItemResponseModel {
        return apiService.getJadwalTujuan()
    }
}