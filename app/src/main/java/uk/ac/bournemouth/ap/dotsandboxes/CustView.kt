package uk.ac.bournemouth.ap.dotsandboxes

import android.content.Context;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color
import android.graphics.Color.BLUE
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable.LINE
import android.view.View



public class CustView : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
                                                                                   )
    //circle and text colors
    private val backCol: Int = android.graphics.Color.BLUE
    private var backPaint: Paint

    //dot creation
    private var dotPaint: Paint
    private var xSep: Float = 50f
    private var ySep: Float = 50f

    //line creation
  //  private var linePaint: Paint
   // private var xSepl1: Float = 20f
   // private var xSepl2: Float = 20f
   // private var ySepl1: Float = 20f
   // private var ySepl2: Float = 20f



    init {
        //paint object for drawing circles in onDraw -- also configure it

        backPaint = Paint().apply {
            // Set up the paint style
            setStyle(Style.FILL)
            setColor(backCol)
        }

        dotPaint = Paint().apply {
            setStrokeWidth(15f)
            setStrokeCap(Paint.Cap.SQUARE)
            setColor(Color.WHITE)
        }


    }
    override fun onDraw(canvas: Canvas) {
//background
        val canvasWidth = width.toFloat()
        val canvasHeight = height.toFloat()
//drawing rectancle which works as background too
        canvas.drawRect(0f, 0f, canvasWidth, canvasHeight, backPaint)
//drawing line
       // canvas.drawLine(xSepl1, ySepl1, xSepl2, ySepl2, linePaint)
// X point --- CHANGE
        for (x in 1..5) {
            for (y in 1..5) {
                canvas.drawPoint(x*xSep, y*ySep, dotPaint)
            }
        }


    }}










