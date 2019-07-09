package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/31
 * @Description :
 */
enum class EnmuKotlinDaily(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0);

    fun rgb() = r + g + b
}

fun getColor(color: EnmuKotlinDaily) =
        when (color) {
            EnmuKotlinDaily.RED -> "red"
            EnmuKotlinDaily.GREEN -> "green"
        }


