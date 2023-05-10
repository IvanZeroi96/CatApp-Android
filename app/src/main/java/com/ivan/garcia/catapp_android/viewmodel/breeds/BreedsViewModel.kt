package com.ivan.garcia.catapp_android.viewmodel.breeds

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ivan.garcia.catapp_android.api.ApiServices
import com.ivan.garcia.catapp_android.model.Common
import com.ivan.garcia.catapp_android.model.breeds.BreedsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BreedsViewModel : ViewModel() {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Common().baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service : ApiServices = retrofit.create(ApiServices::class.java)

    val breedsList = MutableLiveData<List<BreedsModel>>()

    fun getBreedsDataList(){

        val call = service.getBreedsData()

        call.enqueue(object: Callback<List<BreedsModel>> {
            override fun onResponse(call: Call<List<BreedsModel>>, response: Response<List<BreedsModel>>) {
                response.body()?.let {
                        list -> breedsList.postValue(list)
                }
            }

            override fun onFailure(call: Call<List<BreedsModel>>, t: Throwable) {
                call.cancel()
            }
        })
    }
}