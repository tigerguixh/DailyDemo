package tiger.com.lp.dailydemo.mvvm.repository

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tiger.com.lp.dailydemo.mvvm.api.Api
import tiger.com.lp.dailydemo.mvvm.db.UserDao
import tiger.com.lp.dailydemo.mvvm.model.User
import tiger.com.lp.dailydemo.network.ApiFactory

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/30
 * @Description :
 */
class UserRepository(private val userDao: UserDao) {
    fun getUser(name: String) : LiveData<User> {
        refresh(name)
        return userDao.getUserByName(name)
    }

    fun refresh(userName: String) {
        ApiFactory.getInstance()
            .create(Api::class.java)
            .getUser(userName)
            .enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if (response.body() != null) {
                        userDao.insertUser(response.body()!!)
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                }

            })
    }
}