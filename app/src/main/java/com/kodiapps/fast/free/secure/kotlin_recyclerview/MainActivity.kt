package com.kodiapps.fast.free.secure.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = generateList(500)
        val adapter = ExampleAdapter(list,this)
        val recycler_view : RecyclerView = findViewById(R.id.recycler_view)


        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }

    private fun generateList(i: Int): List<ExampleItem> {

        val list = ArrayList<ExampleItem>()

        for (j in 0 until i)
        {
            val darable = when(j%3)
            {
                0->R.drawable.ic_android
                1->R.drawable.ic_3g
                else->R.drawable.ic_4g

            }

            val item = ExampleItem(darable,"Item $j","Line 2")
            list += item
        }
        return list
    }
}