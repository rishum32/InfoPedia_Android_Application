package com.example.infopedia

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val requested_event=intent.getStringExtra("filler")
        val trrr:TextView = findViewById(R.id.textView6)
        trrr.text = "Generating $requested_event list for your interest"

        Handler().postDelayed({
            when(requested_event){
                "Hackathon" -> startActivity(Intent(this,Hackathons::class.java))
                "Event" -> startActivity(Intent(this,Events::class.java))

                "Coding contests" -> startActivity(Intent(this,CodingContest::class.java))
                "Meet up" -> startActivity(Intent(this,MeetUp::class.java))
                "Courses" -> startActivity(Intent(this,Courses::class.java))

                "Tech News" -> startActivity(Intent(this,TechNews::class.java))
                else -> startActivity(Intent(this,Menu::class.java))
            }
            finish()
        }, SPLASH_TIME_OUT)

    }




}