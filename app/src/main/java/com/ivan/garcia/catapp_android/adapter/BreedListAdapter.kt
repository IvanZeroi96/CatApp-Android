package com.ivan.garcia.catapp_android.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ivan.garcia.catapp_android.R
import com.ivan.garcia.catapp_android.model.Common
import com.ivan.garcia.catapp_android.model.breeds.BreedsModel
import com.squareup.picasso.Picasso

class BreedListAdapter() : RecyclerView.Adapter<BreedListAdapter.ViewHolder>() {

    private val context: Context? = null
    var breedList: List<BreedsModel> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<BreedsModel>){
        breedList = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val breedTextView: TextView
        val originTextView: TextView
        val intelligenceTextView: TextView
        val breedImageView: ImageView

        init {
            breedTextView = view.findViewById(R.id.breedTxtView)
            originTextView = view.findViewById(R.id.originTxtView)
            intelligenceTextView = view.findViewById(R.id.intelligenceTxtView)
            breedImageView = view.findViewById(R.id.breedImageView)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.breed_card, viewGroup, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        var breed = breedList[position]
        viewHolder.breedTextView.text = "Raza: ${breed.name}"
        viewHolder.originTextView.text = "Origen: ${breed.origin}"
        viewHolder.intelligenceTextView.text = "Inteligencia ${breed.intelligence}"

        Log.d("Image",Common().baseUrlImageCats + breed.referenceImageID + ".jpg")

        Picasso.get().load(Common().baseUrlImageCats + breed.referenceImageID + ".jpg").into(viewHolder.breedImageView)

    }

    override fun getItemCount() = breedList.size
}