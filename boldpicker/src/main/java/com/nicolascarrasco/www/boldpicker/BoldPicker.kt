package com.nicolascarrasco.www.boldpicker

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by ncarrasco on 14-11-2017.
 */
class BoldPicker(context: Context, attrs: AttributeSet?) : View(context, attrs) {

    constructor(context: Context) : this(context, null)

    var min = 0
    var max = 0
    val values by lazy { (min..max step 1).toList() }
    val paint by lazy { Paint() }

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.BoldPicker)

            min = a.getInt(R.styleable.BoldPicker_min, min)
            max = a.getInt(R.styleable.BoldPicker_max, max)

            a.recycle()
        }
        paint.setARGB(255, 0, 0, 0)
        paint.textSize = 18f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas!!.drawText(values.toString(), 50f, 50f, paint)
    }
}