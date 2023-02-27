package com.socialquantum.acityi.kicuvh

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.socialquantum.acityi.zasadw.Nkixuyctfrvdc
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val hxjzcijvuhchv = module {

    single  <Yusisoxixicjxij> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Yusisoxixicjxij::class.java)
    }

    single <Dosoixcuuvyygbv> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Dosoixcuuvyygbv::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://voodoodeities.life/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Boaoakjiuhxh(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Xosoijcuhhuvygd(get(named("HostInter")))
    }
    single{
        cplvojchuucxh()
    }
    single (named("SharedPreferences")) {
        ncmxmivjhuhuhufg(androidApplication())
    }
}

fun ncmxmivjhuhuhufg(uifiodokf: Application): SharedPreferences {
    return uifiodokf.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun cplvojchuucxh(): Gson {
    return GsonBuilder().create()
}

val zpaooksoxjiuchsgycys = module {
    viewModel (named("MainModel")){
        Grpepposkixjc((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Nkixuyctfrvdc(get())
    }
}