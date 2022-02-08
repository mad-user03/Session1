package com.example.session1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchScrene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(4000 , 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@LaunchScrene, SignInScene::class.java))
            }

        }.start()
    }
}