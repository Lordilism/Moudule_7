package com.example.module7.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module7.R
import com.example.module7.adapterView.ViewPagerWithCustomView
import kotlinx.android.synthetic.main.activity_with_view_pager_custom_view.*

class ActivityWithViewPagerCustomView : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context,ActivityWithViewPagerCustomView::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_view_pager_custom_view)
        val adapter= ViewPagerWithCustomView()
        viewPagerCustomView.adapter=adapter

    }
}