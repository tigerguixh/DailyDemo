package tiger.com.lp.dailydemo.kotlin.retrofit

import com.google.gson.Gson
import okhttp3.Call
import okhttp3.Response
import java.io.IOException
import java.lang.reflect.Type

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/18
 * @Description :
 */
class KtCall<T: Any>(
    private val call: Call,
    private val gson: Gson,
    private val type: Type
) {
    fun call(callback: Callback<T>): Call {
        call.enqueue(object : okhttp3.Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback.onFail(e)
            }

            override fun onResponse(call: Call, response: Response) {
                try { // ①
                    val t = gson.fromJson<T>(response.body()?.string(), type)
                    callback.onSuccess(t)
                } catch (e: Exception) {
                    callback.onFail(e)
                }
            }
        })
        return call
    }
}