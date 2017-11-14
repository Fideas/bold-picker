package com.nicolascarrasco.www.boldpicker

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Created by ncarrasco on 14-11-2017.
 */
class BoldPicker(context: Context, attrs: AttributeSet?): View(context, attrs){

    constructor(context: Context):this(context, null)

    var min = 0

    init {
        if (attrs != null){
           val  a = context.obtainStyledAttributes(attrs, R.styleable.BoldPicker)

            min = a.getInt(R.styleable.BoldPicker_min, min)

            a.recycle()
        }
    }
}