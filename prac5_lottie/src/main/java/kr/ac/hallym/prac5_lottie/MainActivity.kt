package kr.ac.hallym.prac5_lottie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button = findViewById<Button>(R.id.button1)
        Button.setOnClickListener {
            val splashintent = Intent(this,SplashActivity::class.java)
            startActivity(splashintent)
        }

    }
}