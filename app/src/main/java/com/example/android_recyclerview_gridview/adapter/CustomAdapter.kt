package com.example.android_recyclerview_gridview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview_gridview.R
import com.example.android_recyclerview_gridview.model.User

class CustomAdapter(var context: Context, var items: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return CustomViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]

        if (holder is CustomViewHolder) {
            holder.tv_fullname.text = item.fullname
        }
    }


    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tv_fullname: TextView

        init {
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }


}