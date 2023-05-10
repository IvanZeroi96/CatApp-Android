package com.ivan.garcia.catapp_android.api
import com.ivan.garcia.catapp_android.model.breeds.BreedsModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiServices{
    @GET("breeds")
    fun getBreedsData(): Call<List<BreedsModel>>
}