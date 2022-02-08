package com.example.session1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignInScene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_scene)


    }
    fun onClickTopButton(view: View) {
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
    }

    fun onClickckck(view: View) {
        val intent = Intent(this, SignUpScene::class.java)
        startActivity(intent)
    }

}