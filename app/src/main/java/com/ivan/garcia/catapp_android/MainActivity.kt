package com.ivan.garcia.catapp_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ivan.garcia.catapp_android.adapter.BreedListAdapter
import com.ivan.garcia.catapp_android.viewmodel.breeds.BreedsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var breedsViewModel: BreedsViewModel
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UI()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BreedListAdapter()

        breedsViewModel = ViewModelProvider(this)[BreedsViewModel::class.java]
        breedsViewModel.getBreedsDataList()

        breedsViewModel.breedsList.observe(this) { list ->
            (recyclerView.adapter as BreedListAdapter).setData(list)
        }
    }

    private fun UI(){
        recyclerView =  findViewById(R.id.breedsListRecyclerView)
    }
}