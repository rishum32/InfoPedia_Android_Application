package com.example.infopedia

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun Any.toast(context: Context, duration: Int = Toast.LENGTH_SHORT): Toast {
            return Toast.makeText(context, this.toString(), duration).apply { show() }
        }


        val c: Calendar = Calendar.getInstance()
        val timeOfDay: Int = c.get(Calendar.HOUR_OF_DAY)

        if (timeOfDay >= 0 && timeOfDay < 12) {
              "Good Morning".toast(context = this)
            //Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show()
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            "Good Afternoon".toast(context = this)
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            "Good Evening".toast(context = this)
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            "Good Night".toast(context = this)
        }

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}
