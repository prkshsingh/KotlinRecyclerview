package com.developers.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cityList: ArrayList<String> = ArrayList()

    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cityList.add("Delhi")
        cityList.add("Mumbai")
        cityList.add("Bangalore")
        cityList.add("Hyderabad")
        cityList.add("Ahmedabad")
        layoutManager = LinearLayoutManager(this)
        rvCityList.layoutManager = layoutManager
        rvCityList.adapter = CityAdapter(this, cityList)
    }
}