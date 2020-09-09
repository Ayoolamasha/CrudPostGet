package com.kadick.myapplication.Activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.kadick.myapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var submitBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewsSetup()

        submitBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SubmissionActivity::class.java)
            startActivity(intent)
        })
    }

    private fun viewsSetup(){
        submitBtn = findViewById(R.id.submit)
    }
}