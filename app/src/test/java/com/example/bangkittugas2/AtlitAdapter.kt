package com.example.bangkittugas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AtlitAdapter(private val atlitList: List<Atlit>, private val onItemClick: (Atlit) -> Unit)
    : RecyclerView.Adapter<AtlitAdapter.AtlitViewHolder>() {

    class AtlitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.ivImage)
        val titleView: TextView = view.findViewById(R.id.tvTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AtlitViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_atlit, parent, false)
        return AtlitViewHolder(view)
    }

    override fun onBindViewHolder(holder: AtlitViewHolder, position: Int) {
        val atlit = atlitList[position]
        holder.titleView.text = atlit.title
        holder.imageView.setImageResource(atlit.imageRes)

        holder.itemView.setOnClickListener {
            onItemClick(atlit)
        }
    }

    override fun getItemCount() = atlitList.size
}