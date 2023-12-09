package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResepAdapter(private val context: Context, private val tiket: List<Resep>, val listener: (Resep) -> Unit)
    : RecyclerView.Adapter<ResepAdapter.TiketViewHolder>(){

    class TiketViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgresep = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameresep = view.findViewById<TextView>(R.id.tv_item_name)
        val descresep = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(tiket: Resep, listener: (Resep) -> Unit) {
            imgresep.setImageResource(tiket.imgresep)
            nameresep.text = tiket.nameresep
            descresep.text = tiket.descresep
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiketViewHolder {
        return TiketViewHolder(
            LayoutInflater.from(context).inflate(R.layout.resep_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TiketViewHolder, position: Int) {
        holder.bindView(tiket[position], listener)
    }

    override fun getItemCount(): Int = tiket.size

    }

