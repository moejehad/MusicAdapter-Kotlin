package com.example.androidass7.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidass7.R
import com.example.androidass7.model.Album
import kotlinx.android.synthetic.main.recy_item.view.*

class AlbumAdapter(var activity: Activity, var data:ArrayList<Album>) : RecyclerView.Adapter<AlbumAdapter.MyHolder>() {

    class MyHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.image
        val title = itemView.title
        val desc = itemView.desc
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumAdapter.MyHolder {
        val root = LayoutInflater.from(activity).inflate(R.layout.recy_item,parent,false)
        return MyHolder(root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AlbumAdapter.MyHolder, position: Int) {
        holder.image.setImageResource(data[position].img)
        holder.title.text = data[position].title
        holder.desc.text = data[position].desc
    }

}