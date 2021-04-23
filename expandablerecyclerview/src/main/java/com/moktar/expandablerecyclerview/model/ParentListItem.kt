package com.moktar.expandablerecyclerview.model

interface ParentListItem {
    fun getChildItemList():List<*>
    fun isInitiallyExpanded():Boolean
}