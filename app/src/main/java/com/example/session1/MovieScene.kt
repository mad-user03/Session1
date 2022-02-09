package com.example.session1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SearchView
import kotlinx.android.synthetic.main.activity_movie_scene.*
import kotlinx.android.synthetic.main.activity_movie_scene.view.*

class MovieScene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_scene)
    }

    fun playButton(view: View) {
        imageView9.setImageResource(R.drawable.ep1)
    }


}