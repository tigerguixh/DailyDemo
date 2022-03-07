package tiger.com.lp.dailydemo.kotlin.daily

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/2/11
 * @Description :
 */
class SingleUserManager private constructor(name: String){
    private var num = 1
    companion object {
        @Volatile private var INSTANCE: SingleUserManager? = null
        fun getInstance(name: String) : SingleUserManager =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: SingleUserManager(name).also {
                    INSTANCE = it
                }
            }
    }

    fun single() {
        SingleUserManager.getInstance("Jack")

        "".chas()
    }

    fun String.chas() {
        num += num

        var result = "testLet".let {
            println(it)
            println(it)
            println(it)
            "ok"
        }

        ArrayList<String>().apply {
            add("testApply")
            add("testApply")
            add("testApply")
        }.let { println(it) }
    }
}