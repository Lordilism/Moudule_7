package com.example.module7.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.module7.R
import com.example.module7.adapterView.NewsAdapter
import com.example.module7.delegate.NewsItemActionDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemActionDelegate {
    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context,MainActivity::class.java)
        }
    }

    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = NewsAdapter(this)
        rvNews.adapter = adapter
        rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    override fun onTapNews() {
        startActivity(DetailsNewsActivity.newIntent(this))
    }


}