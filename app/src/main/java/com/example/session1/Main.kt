package com.example.session1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main2.*

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun WatchButton(view: View) {
        val intent = Intent(this, MovieScene::class.java)
        startActivity(intent)
    }

    fun onPlay(view: View) {
        image.setImageResource(R.drawable.playimage)
        imageView12.setImageResource(R.drawable.line)
        imageButton4.setImageResource(R.drawable.playbuttonsecond)
        textView9.visibility
        scrollView.height.compareTo(768)
    }


    fun imClick(view: View) {
        image.setImageResource(R.drawable.lastmovie)
        imageView12.setImageResource(R.drawable.gradientforlowline)
        imageButton4.setImageResource(R.drawable.gradientforlowline)
        imageView22.setImageResource(R.drawable.rectangle)
    }
}