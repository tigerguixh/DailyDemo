package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/28
 * @Description :
 */
object DataProviderManager{
    fun create() {
        println("this is a instance class.")
    }
}

class CompanionDaily{
    companion object {
        fun findCompanion() {
            println("this is a companion fun.")
        }
    }
}

fun main(args : Array<String>) {
    DataProviderManager.create()
    CompanionDaily.findCompanion()
}