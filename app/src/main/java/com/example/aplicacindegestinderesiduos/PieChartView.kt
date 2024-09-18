package com.example.aplicacindegestinderesiduos

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class PieChartView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.FILL
    }

    private var recycledAmount = 0f
    private var nonRecycledAmount = 0f

    init {
        // Initialize paint if needed
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Calculate total and angles
        val total = recycledAmount + nonRecycledAmount
        val recycledAngle = if (total > 0) (recycledAmount / total) * 360 else 0f
        val nonRecycledAngle = 360f - recycledAngle

        val radius = Math.min(width, height) / 2f
        val centerX = width / 2f
        val centerY = height / 2f

        // Draw recycled part
        paint.color = Color.GREEN
        canvas.drawArc(
            centerX - radius, centerY - radius, centerX + radius, centerY + radius,
            -90f, recycledAngle, true, paint
        )

        // Draw non-recycled part
        paint.color = Color.RED
        canvas.drawArc(
            centerX - radius, centerY - radius, centerX + radius, centerY + radius,
            -90f + recycledAngle, nonRecycledAngle, true, paint
        )
    }

    fun setData(recycled: Float, nonRecycled: Float) {
        this.recycledAmount = recycled
        this.nonRecycledAmount = nonRecycled
        invalidate() // Trigger a redraw
    }
}
