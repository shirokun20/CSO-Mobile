package com.cso.mobile.features.tiket.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TiketItemResponseModel(
   val tiketux: TiketItemInfo
)

@JsonClass(generateAdapter = true)
data class TiketItemInfo(
    val result: List<TiketItemModel>,
    val status: String,
    val time: String
)

@JsonClass(generateAdapter = true)
data class TiketItemModel(
    val id: String,
    val nama: String,
    val rute: String,
    val tarif: Int,
    val tarif_str: String,
    val kapasitas: Int,
    val terisi: Int,
    val tersedia: Int
)