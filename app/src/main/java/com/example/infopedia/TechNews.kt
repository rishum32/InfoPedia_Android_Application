package com.example.infopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class TechNews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_news)

        val menu_button: Button = findViewById(R.id.back2_menu_button)
        menu_button.setOnClickListener{ display_and_move() }
    }

    private fun display_and_move() {
        Toast.makeText(applicationContext, "Hope you find the information useful", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this,Menu::class.java))
        finish()
    }
}