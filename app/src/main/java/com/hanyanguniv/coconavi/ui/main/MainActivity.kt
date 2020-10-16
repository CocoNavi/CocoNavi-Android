package com.hanyanguniv.coconavi.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hanyanguniv.coconavi.R
import com.hanyanguniv.coconavi.ui.splash.view.SplashActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_logout.setOnClickListener {
            Firebase.auth.signOut()
            SplashActivity.googleSignInClient.signOut().addOnCompleteListener {
                finish()
            }
        }
    }
}