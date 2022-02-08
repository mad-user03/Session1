package com.example.session1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUpScene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_scene2)
    }

    fun onClickEndButtonTwo(view: View) {

        val intent = Intent(this, SignInScene::class.java)
        startActivity(intent)
    }
    fun onClickTopButtonTwo(view: View) {
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
    }
}