package com.moktar.expandablerecyclerview.sample.model

import com.moktar.expandablerecyclerview.model.ParentListItem

data class Category(val name:String, val dishes:List<CategoryList>) : ParentListItem {
    override fun getChildItemList(): List<*> = dishes
    override fun isInitiallyExpanded(): Boolean = false
}