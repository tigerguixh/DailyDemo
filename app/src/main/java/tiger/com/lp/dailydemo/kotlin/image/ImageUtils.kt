package tiger.com.lp.dailydemo.kotlin.image

import android.graphics.Color
import kotlin.concurrent.thread

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/21
 * @Description :
 */
class ImageUtils {
}

fun main() {
    thread() {
        Thread.sleep(100)
        println("Nice")
    }
}


/**
 * 图片裁切
 */
fun Image.crop(startY: Int, startX: Int, width: Int, height: Int): Image {
    val pixels = Array(height) { y ->
        Array(width) { x ->
            getPixel(startY + y, startX + x)
        }
    }
    return Image(pixels)
}


class Image(private val pixels: Array<Array<Color>>) {

    fun height(): Int {
        return pixels.size
    }

    fun width(): Int {
        return pixels[0].size
    }

    /**
     * 底层不处理越界
     */
    fun getPixel(y: Int, x: Int): Color {
        return pixels[y][x]
    }
}