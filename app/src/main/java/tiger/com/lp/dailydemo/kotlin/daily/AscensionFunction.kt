package tiger.com.lp.dailydemo.kotlin.daily

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/1/21
 * @Description :
 */
class AscensionFunction {
    fun <T> Collection<T>.joinToString(
        separator: String = ", ", prefix: String = "", postfix: String = "",
        transform: (T) -> String = { it.toString() }
    ): String {
        val result = StringBuilder(prefix)

        for ((index, element) in this.withIndex()) {
            if (index > 0) {
                result.append(separator)
            }
            result.append(transform(element))
        }

        result.append(postfix)
        return result.toString()
    }

    fun main() {
        var strs = mutableListOf<String>()
        strs.joinToString{ it.toLowerCase() }
    }
}