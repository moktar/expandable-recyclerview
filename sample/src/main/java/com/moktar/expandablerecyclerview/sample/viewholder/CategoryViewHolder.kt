package com.moktar.expandablerecyclerview.sample.viewholder

import android.view.View
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.moktar.expandablerecyclerview.sample.R
import com.moktar.expandablerecyclerview.sample.model.Category
import com.moktar.expandablerecyclerview.viewholder.ParentViewHolder

class CategoryViewHolder(itemView:View) : ParentViewHolder(itemView) {
    private lateinit var animation: RotateAnimation

    fun bind(category: Category){
        itemView.findViewById<AppCompatTextView>(R.id.tv_category).text = category.name
    }

    override fun onExpansionToggled(expanded: Boolean) {
        super.onExpansionToggled(expanded)
        animation = if (expanded)
            RotateAnimation(180f,0f, RotateAnimation.RELATIVE_TO_SELF,
                0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f)
        else
            RotateAnimation(-1 * 180f,0f, RotateAnimation.RELATIVE_TO_SELF,
                0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f)

        animation.duration = 200
        animation.fillAfter = true
        itemView.findViewById<ImageView>(R.id.iv_arrow_expand).startAnimation(animation)

    }

    override fun setExpanded(expanded: Boolean) {
        super.setExpanded(expanded)
        if (expanded)itemView.findViewById<ImageView>(R.id.iv_arrow_expand).rotation = 180f
        else itemView.findViewById<ImageView>(R.id.iv_arrow_expand).rotation = 0f
    }
}