package com.example.infopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        setNextActivity()
    }

    public fun setNextActivity() {
        val clickableviews: List<View> =
            listOf(button12, button13, button14, button15, button16, button17)

        var requested_Event: String

        for (elements in clickableviews) {
            elements.setOnClickListener {
                requested_Event = displayNextActivity(it)
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("filler", requested_Event)
                startActivity(intent)
            }
        }
    }

        private fun displayNextActivity(view: View):String {

            val tee: Button
            when (view.id) {
                R.id.button12 -> return "Coding contests"
                R.id.button13 -> return "Hackathon"

                R.id.button14 -> return "Event"
                R.id.button15 -> return "Meet up"
                R.id.button16 -> return "Courses"

                else -> return "Tech News"
            }
        }
}