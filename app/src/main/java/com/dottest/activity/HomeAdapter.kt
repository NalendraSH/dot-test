package com.dottest.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dottest.R
import com.dottest.model.ListData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_multiple_image.view.*
import kotlinx.android.synthetic.main.item_single_image.view.*

class HomeAdapter (private val items: MutableList<ListData.Data> = mutableListOf()):
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        return if (viewType == 0){
            SingleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_single_image, parent, false))
        }else {
            MultipleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_multiple_image, parent, false))
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return if (items[position].type == "image")
            0
        else
            1
    }

    fun addList(list: MutableList<ListData.Data>){
        items.clear()
        items.addAll(list)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is SingleViewHolder -> holder.bindView(items[position], context)
            is MultipleViewHolder -> holder.bindView(items[position], context)
        }
    }

    class SingleViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindView(item: ListData.Data, context: Context){
            Picasso.get().load(item.media[0]).placeholder(context.resources.getDrawable(R.drawable.placeholder)).into(itemView.imageview_item_single)
            itemView.textview_item_single_title.text = item.title
            itemView.textview_item_single_content.text = item.content
        }
    }

    class MultipleViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindView(item: ListData.Data, context: Context){
            itemView.textview_item_multiple_title.text = item.title
            itemView.textview_item_multiple_content.text = item.content
            val imageList = item.media
            val imageAdapter = ImageAdapter()
            imageAdapter.addImages(imageList)
            itemView.recyclerview_item_multiple.adapter = imageAdapter
            itemView.recyclerview_item_multiple.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }
    }
}