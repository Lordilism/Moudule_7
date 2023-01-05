package com.example.module7.adapterView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.module7.R
import com.example.module7.delegate.NewsItemActionDelegate
import com.example.module7.viewHolder.BaseViewHolder
import com.example.module7.viewHolder.ViewHolder
import com.example.module7.viewHolder.ViewHolderYooyar

class NewsAdapter(private val delegate: NewsItemActionDelegate): RecyclerView.Adapter<BaseViewHolder>() {
    val VIEW_TYPE_YOOYAR=1
    val VIEW_TYPE_T6=2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when(viewType){
            VIEW_TYPE_T6->{
                val itemView =LayoutInflater.from(parent.context).inflate(R.layout.view_holder,parent,false)
                return ViewHolder(itemView,delegate)
            }
            VIEW_TYPE_YOOYAR->{
                val itemView=LayoutInflater.from(parent.context).inflate(R.layout.view_holder_yooyar,parent,false)
                return ViewHolderYooyar(itemView,delegate)
            }
            else->{
                val itemView=LayoutInflater.from(parent.context).inflate(R.layout.view_holder_yooyar,parent,false)
                return ViewHolderYooyar(itemView,delegate)
            }
        }
    }


    override fun getItemCount(): Int {
        return 6

    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return when{
            position%3==0-> VIEW_TYPE_YOOYAR
            else-> VIEW_TYPE_T6
        }
    }
}