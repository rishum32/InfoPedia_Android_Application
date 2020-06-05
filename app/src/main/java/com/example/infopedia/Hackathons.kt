package com.example.infopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_hackathons.*


class Hackathons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hackathons)

        val menu_button:Button = findViewById(R.id.back2_menu_button)
        menu_button.setOnClickListener{ display_and_move() }
    }

    private fun display_and_move() {
        Toast.makeText(applicationContext, "Hope you find the information useful", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this,Menu::class.java))
        finish()
    }
}
