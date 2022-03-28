package tiger.com.lp.dailydemo.kotlin.leecode

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/11
 * @Description :
 */
class RemoveWord {

}

fun main(args: Array<String>) {
    print(removeVowels("afda fdafewaoiowau"))
}

fun removeVowels(s: String) : String {
    return s.filter {
        it !in setOf('a', 'e', 'i', 'o', 'u')
    }
}