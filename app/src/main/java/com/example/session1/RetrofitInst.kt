package com.example.session1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInst {
    const val BASE_URL = "http://cinema.areas.su/usermovies?filter=new"

    val retrofit by lazy {
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).build()
    }

//    val api : RetrofitInterface

}