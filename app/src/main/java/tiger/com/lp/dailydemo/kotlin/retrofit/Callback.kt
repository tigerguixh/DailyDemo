package tiger.com.lp.dailydemo.kotlin.retrofit

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/18
 * @Description :
 */
interface Callback<T: Any> {
    fun onSuccess(data: T)
    fun onFail(throwable: Throwable)
}