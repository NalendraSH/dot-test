package com.dottest.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dottest.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.view.*

class ImageAdapter (private val images: MutableList<String> = mutableListOf()):
        RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false))
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(images[position], context)
    }

    fun addImages(media: MutableList<String>){
        images.clear()
        images.addAll(media)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindView(media: String, context: Context) {
            Picasso.get().load(media).placeholder(context.resources.getDrawable(R.drawable.placeholder)).into(itemView.imageview_item_multiple)
        }
    }
}