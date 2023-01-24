package com.example.android_recyclerview_gridview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview_gridview.R
import com.example.android_recyclerview_gridview.adapter.CustomAdapter
import com.example.android_recyclerview_gridview.model.User

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter(loadUser())
    }

    private fun refreshAdapter(items: ArrayList<User>) {
        var adapter = CustomAdapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun loadUser(): ArrayList<User> {
        var items = ArrayList<User>()
        for (i in 0..60) {
            items.add(User("item ${i}"))
        }
        return items
    }
}