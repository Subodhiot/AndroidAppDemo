package com.example.interectiveapp

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var isVisible = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttondark = findViewById<Button>(R.id.btnDark)
        val buttonLight  = findViewById<Button>(R.id.btnLight)
        val Layout = findViewById<LinearLayout>(R.id.LinearLayout)
        buttondark.setOnClickListener(){
            // change the colour mode
            Layout.setBackgroundResource(R.drawable.download)

        }
        buttonLight.setOnClickListener(){
            val imageview = findViewById<ImageView>(R.id.sexyimage)
            if (isVisible) {
                imageview.visibility = View.GONE
                isVisible = true
            } else {
                imageview.visibility = View.VISIBLE
                isVisible = true
            }
        }
    }
}