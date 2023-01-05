package com.example.module7.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.module7.delegate.NewsItemActionDelegate

class ViewHolder(itemView: View,delegate: NewsItemActionDelegate):BaseViewHolder(itemView,delegate) {
    init {
        itemView.setOnClickListener {
            delegate.onTapNews()
        }

    }

}
