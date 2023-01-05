package com.example.module7.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.module7.R

class DetailsNewsActivity:AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent{
            return Intent(context,DetailsNewsActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatails_news)

    }
}