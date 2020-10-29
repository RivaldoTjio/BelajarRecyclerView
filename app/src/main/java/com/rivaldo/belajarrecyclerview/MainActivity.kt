package com.rivaldo.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val recyclerview = findViewById<RecyclerView>(R.id.mRecyclerView)
    recyclerview.setHasFixedSize(true)
    recyclerview.layoutManager = LinearLayoutManager(this)
    for (i in 0 until listUsers.size) {
        list.add(Users(listUsers.get(i),"Halo" ))
        if (listUsers.size - 1 == i) {
            val adapter = Adapter(list)
            adapter.notifyDataSetChanged()
            recyclerview.adapter = adapter
            }
        }
    }
}