package com.cso.mobile.features.tiket.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TiketResponseModel(
   val tiketux: TiketInfo
)

@JsonClass(generateAdapter = true)
data class TiketInfo(
    val result: List<TiketModel>,
    val status: String,
    val time: String
)

@JsonClass(generateAdapter = true)
data class TiketModel(
    val id: String,
    val nama: String,
    val alamat: String,
    val tgl_berangkat_induk: String,
    val tgl_berangkat: String,
    val jam_berangkat: String
)