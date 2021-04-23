package com.moktar.expandablerecyclerview.sample.viewholder

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.moktar.expandablerecyclerview.sample.R
import com.moktar.expandablerecyclerview.sample.model.CategoryList
import com.moktar.expandablerecyclerview.viewholder.ChildViewHolder

class CategoryListViewHolder(view:View) : ChildViewHolder(view){
    fun bind(categoryList : CategoryList){
        itemView.findViewById<AppCompatImageView>(R.id.imageView).setImageResource(categoryList.imageResourceId)
        itemView.findViewById<AppCompatTextView>(R.id.tvName).text = categoryList.name
        itemView.findViewById<AppCompatTextView>(R.id.tvPrice).text = categoryList.price
    }
}