package com.example.session1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class Adapter(context : AppCompatActivity)  {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }


    fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_main2, viewGroup, false)

        return ViewHolder(view)
    }



}