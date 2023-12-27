package com.cso.mobile.features.armada.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArmadaJadwalResponseModel(
    val tiketux: JadwalResponseModel,
    val status: String,
    val time: String
)

@JsonClass(generateAdapter = true)
data class JadwalResponseModel(
    val result: List<JadwalModel>
)

@JsonClass(generateAdapter = true)
data class JadwalModel(
    val id: String,
    val id_rute: String,
    val kode_jadwal: String,
    val rute: String,
    val rute_kota: String,
    val detail_rute: String,
    val list_outlet_transit: String,
    val list_outlet_pickup: String,
    val list_outlet_dropoff: String,
    val jam: String,
    val keterangan: String,
    val layanan: String,
    val armada: String,
    val kapasitas: Int,
    val terisi: Int,
    val tersedia: Int
)