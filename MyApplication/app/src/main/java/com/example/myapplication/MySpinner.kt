package com.example.myapplication

import android.content.Context
import android.util.AttributeSet

class MySpinner : androidx.appcompat.widget.AppCompatSpinner {
    constructor(context:Context): super(context)
    constructor(context:Context, attrs: AttributeSet): super(context, attrs)
    constructor(context:Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle)

    override fun setSelection(position: Int) {
        super.setSelection(position)
    }

    override fun setSelection(position: Int, animate: Boolean) {
        super.setSelection(position, animate)
    }
}