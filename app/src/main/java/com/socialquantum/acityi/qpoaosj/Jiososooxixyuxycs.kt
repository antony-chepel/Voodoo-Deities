package com.socialquantum.acityi.kicuvh

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

class Boaoakjiuhxh(private val kkcixivj: Dosoixcuuvyygbv) {
    suspend fun bvofgdirji() = kkcixivj.kisisjduhwudgyfgy()
}

interface Yusisoxixicjxij {
    @GET("vd_dent.json")
    suspend fun hjjkckkcjvjvjb(): Response<Diwiowsoskdkijcvuh>
}

@Keep
data class Tieowokso(
    @SerializedName("countryCode")
    val hxzuijjicxjivhu: String,
)


class Xosoijcuhhuvygd(private val xijzcjis: Yusisoxixicjxij) {
    suspend fun coooiviuvhgygyf() = xijzcjis.hjjkckkcjvjvjb()
}

@Keep
data class Diwiowsoskdkijcvuh(
    @SerializedName("vd_dent_gnjkvvuchuyg")
    val ocodjifie: String,
    @SerializedName("vd_dent_vfew")
    val okeokwjisijd: String,
    @SerializedName("vd_dent_arepwos")
    val sijdjiwijdwhuhusydygds: String,
)



interface Dosoixcuuvyygbv {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun kisisjduhwudgyfgy(): Response<Tieowokso>
}











