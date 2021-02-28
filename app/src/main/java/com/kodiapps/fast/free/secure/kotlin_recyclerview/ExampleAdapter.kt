package com.kodiapps.fast.free.secure.kotlin_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ExampleAdapter(private val list: List<ExampleItem>,public val context :Context) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val text1: TextView = itemView.findViewById(R.id.text_view_1)
        val text2: TextView = itemView.findViewById(R.id.text_view_2)
        val fullitem: CardView = itemView.findViewById(R.id.fullLayoutID);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ExampleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = list[position]

        holder.imageView.setImageResource(list.get(position).imageResoure)
        holder.text1.text = currentItem.text1
        holder.text2.text = currentItem.text2

        holder.fullitem.setOnClickListener(object :View.OnClickListener
        {
            override fun onClick(view: View?) {
                Toast.makeText(context, currentItem.text1, Toast.LENGTH_SHORT).show()
            }
        })
    }
}