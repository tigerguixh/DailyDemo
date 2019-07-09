package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/7/9
 * @Description :
 */
object ObjectDaily : Comparator<ClassKotlinDaily>{
    override fun compare(o1: ClassKotlinDaily?, o2: ClassKotlinDaily?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //return o1.username.compareTo(o2.username)
    }

    fun sumNum(a: Int, b: Int): Int {
        return a + b
    }
}


fun main(array: Array<String>) {
    print(ObjectDaily.sumNum(1, 3))
}
