package com.example.module7.adapterView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.module7.R
import com.example.module7.viewHolder.ImageViewHolder

class ViewPagerWithCustomView : RecyclerView.Adapter<ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 10
    }
}