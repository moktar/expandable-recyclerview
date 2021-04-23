package com.moktar.expandablerecyclerview.sample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.moktar.expandablerecyclerview.adapter.ExpandableRecyclerAdapter
import com.moktar.expandablerecyclerview.model.ParentListItem
import com.moktar.expandablerecyclerview.sample.R
import com.moktar.expandablerecyclerview.sample.model.Category
import com.moktar.expandablerecyclerview.sample.model.CategoryList
import com.moktar.expandablerecyclerview.sample.viewholder.CategoryListViewHolder
import com.moktar.expandablerecyclerview.sample.viewholder.CategoryViewHolder

class CategoryAdapter : ExpandableRecyclerAdapter<CategoryViewHolder, CategoryListViewHolder>(){

    override fun onCreateParentViewHolder(parentViewGroup: ViewGroup
    ): CategoryViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category,
            parentViewGroup, false)
        return CategoryViewHolder(view)
    }

    override fun onCreateChildViewHolder(parentViewGroup: ViewGroup): CategoryListViewHolder {
        val view = LayoutInflater.from(parentViewGroup.context).inflate(R.layout.item_category_list,
            parentViewGroup, false)
        return CategoryListViewHolder(view)
    }

    override fun onBindParentViewHolder(parentViewHolder: CategoryViewHolder, position: Int,
                                        parentListItem: ParentListItem) {
        val data = parentListItem as Category
        parentViewHolder.bind(data)
    }

    override fun onBindChildViewHolder(childViewHolder: CategoryListViewHolder, position: Int,
                                       childListItem: Any) {
        val data = childListItem as CategoryList
        childViewHolder.bind(data)
    }
}