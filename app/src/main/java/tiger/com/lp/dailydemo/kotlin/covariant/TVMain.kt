package tiger.com.lp.dailydemo.kotlin.covariant

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/2/22
 * @Description :
 */
class TVMain {
    fun foo(tv: TV) {

    }

    fun buy(controller: TVController<in XiaoMiTV1>) {
        val xiaoMiTV1 = XiaoMiTV1()
        controller.turnOn(xiaoMiTV1)
    }

    fun main() {
        foo(XiaoMiTV1())
        buy(TVController<TV>())
    }
}