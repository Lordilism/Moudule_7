package com.example.module7.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module7.R
import kotlinx.android.synthetic.main.activity_launcher.*

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        btnRecycler.setOnClickListener {
            val intent=Intent(MainActivity.newIntent(this))
            startActivity(intent)

        }
        btnViewpager.setOnClickListener {
            val intent=Intent(ActivityWithViewPagerCustomView.newIntent(this))
            startActivity(intent)
        }
    }
}