package tiger.com.lp.dailydemo.kotlin.daily

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.math.BigDecimal

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/1/20
 * @Description :
 */
class EnglishTotal {

    @RequiresApi(Build.VERSION_CODES.N)
    fun processText(text: String) {
        var result = text
            .clean().split(" ")
            .getWordCount()
            .mapToList { WordFreq(it.key, it.value) }
    }

    fun main() {
        val s = test(1, 2) {
          a, b -> a + b
        }
    }

    inline fun test(a: Int, b: Int, plu: (Int, Int) -> Int) : Int{
        return plu(a, b)
    }

    fun plus(a: Int, b: Int) = a + b

    // 转换成扩展函数
    fun String.clean(): String {
        return this.replace("[^A-Za-z]".toRegex(), " ")
            .trim()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun List<String>.getWordCount(): Map<String, Int> {
        val map = HashMap<String, Int>()
        for (element in this) {
            if (element == "") continue
            val trim = element.trim()
            val count = map.getOrDefault(trim, 0)
            map[trim] = count + 1
        }
        return map
    }

    private fun Map<String, Int>.sortByFrequency(): MutableList<WordFreq> {
        val list = mutableListOf<WordFreq>()
        for (entry in this) {
            val freq = WordFreq(entry.key, entry.value)
            list.add(freq)
        }
        return list
    }


    private fun <T> Map<String, Int>.mapToList(transform: (Map.Entry<String, Int>) -> T): MutableList<T> {
        val list = mutableListOf<T>()
        for (entry in this) {
            val freq = transform(entry)
            list.add(freq)
        }
        return list
    }

    class WordFreq(word: String, count: Int){

    }
}