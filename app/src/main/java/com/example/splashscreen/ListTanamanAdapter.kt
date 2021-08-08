package com.example.splashscreen

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTanamanAdapter(private val listTanaman: ArrayList<Tanaman>) :
    RecyclerView.Adapter<ListTanamanAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_plants, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tanaman = listTanaman[position]
        Glide.with(holder.itemView.context)
            .load(tanaman.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = tanaman.nama
        holder.tvDetail.text = tanaman.detail

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailTanamanActivity::class.java)
            intent.putExtra(DetailTanamanActivity.EXTRA_NAME, tanaman.nama)
            intent.putExtra(DetailTanamanActivity.EXTRA_DESC, tanaman.detail)
            intent.putExtra(DetailTanamanActivity.EXTRA_IMG, tanaman.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listTanaman.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Tanaman)
    }
}