package com.demo.suresh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.demo.suresh.R
import com.demo.suresh.model.RepositoryData
import kotlinx.android.synthetic.main.list_row.view.*

class RecyclerViewAdapter(): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    private var listData: List<RepositoryData>? = null
    fun setListData(listData: List<RepositoryData>?) {
        this.listData = listData
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(listData?.get(position)!!)
    }

    override fun getItemCount(): Int {
        if(listData == null )return 0
        return listData?.size!!
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image_avatar_url = view.image_avatar_url
        val name_textview = view.name_textview
        val description_textview = view.description_textview

        fun bind(data: RepositoryData) {
            name_textview.text = data.name
            description_textview.text = data.description

            Glide.with(image_avatar_url)
                .load(data.owner?.avatar_url)
                .into(image_avatar_url)
        }
    }
}