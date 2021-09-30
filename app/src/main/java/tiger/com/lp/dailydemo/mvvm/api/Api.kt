package tiger.com.lp.dailydemo.mvvm.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import tiger.com.lp.dailydemo.mvvm.model.User

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/30
 * @Description :
 */
interface Api {
    @GET("users/{userId}")
    fun getUser(@Path("userId") userId: String) : Call<User>
}