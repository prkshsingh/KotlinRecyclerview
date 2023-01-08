package com.developers.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter(private val context: MainActivity, private val cityList: ArrayList<String>) :

    RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_city, parent, false))
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.chapterName?.text = cityList.get(position)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, cityList.get(position), Toast.LENGTH_LONG).show()
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.tvCityName
    }
}
