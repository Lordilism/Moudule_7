package com.example.module7.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.module7.delegate.NewsItemActionDelegate

abstract class BaseViewHolder(itemView: View, delegate: NewsItemActionDelegate) :
    RecyclerView.ViewHolder(itemView) {
}