package tiger.com.lp.dailydemo.widget

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import tiger.com.lp.dailydemo.R

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2023/2/24
 * @Description :
 */
class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    val mPaint = Paint(Paint.ANTI_ALIAS_FLAG or Paint.DITHER_FLAG)

    override fun draw(canvas: Canvas) {
        super.draw(canvas)

        drawBitmap(canvas)
    }

    private fun drawBitmap(canvas: Canvas) {
        val bitmap = BitmapFactory.decodeResource(resources, R.mipmap.bryce_canyon)
        val matrix = Matrix()
        //canvas.drawBitmap(bitmap, matrix, mPaint)

        //matrix.setTranslate(100f, 500f)
        //matrix.setScale(0.5f, 0.5f)
        //canvas.drawBitmap(bitmap, matrix, mPaint)
        //matrix.setRotate(30f)
        //matrix.setSkew(0.5f, 0.5f)

        matrix.setTranslate(100f, 1000f)
        matrix.postScale(0.5f, 0.5f)
        canvas.drawBitmap(bitmap, matrix, mPaint)
    }

    private fun drawBase(canvas: Canvas) {
        /*val rect = Rect(0, 0, 100, 100)

        mPaint.setColor(Color.BLUE)
        canvas.drawRect(rect, mPaint)

        //canvas.translate(200f, 200f)

        mPaint.setColor(Color.RED)
        canvas.drawRect(rect, mPaint)

        *//*val ra = Rect(300, 0, 400, 100)
        mPaint.setColor(Color.BLUE)
        canvas.drawRect(ra, mPaint)

        canvas.rotate(30f)

        mPaint.setColor(Color.RED)
        canvas.drawRect(ra, mPaint)*//*

        *//*val rectw = Rect(0, 0, 400, 400)

        mPaint.color = Color.BLUE
        canvas.drawRect(rectw, mPaint)

        canvas.scale(0.5f, 0.5f)

        mPaint.color = Color.RED
        canvas.drawRect(rectw, mPaint)*//*

        mPaint.style = Paint.Style.STROKE
        val rect4 = Rect(0, 0, 400, 400)

        mPaint.color = Color.BLUE
        canvas.drawRect(rect4, mPaint)

        canvas.skew(0.5f, 0.5f)

        mPaint.color = Color.RED
        canvas.drawRect(rect4, mPaint)*/


        val rect = Rect(0, 0, 200, 200)
        canvas.save()
        canvas.clipRect(rect)
        canvas.drawColor(Color.BLUE)
        canvas.restore()
        canvas.drawColor(Color.RED)
    }

}