package com.cso.mobile.features.armada.repository

import com.cso.mobile.components.instances.RetrofitInstance
import com.cso.mobile.features.armada.model.ArmadaJadwalResponseModel


class ArmadaRepository {
    private val apiService = RetrofitInstance.apiService
    suspend fun getJadwal(): ArmadaJadwalResponseModel {
        return apiService.getJadwal()
    }
}