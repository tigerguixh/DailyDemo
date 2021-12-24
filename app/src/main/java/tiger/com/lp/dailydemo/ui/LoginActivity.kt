package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tiger.com.lp.dailydemo.application.ApplicationDaily
import tiger.com.lp.dailydemo.dagger.component.LoginComponent
import tiger.com.lp.dailydemo.dagger.viewmodel.LoginViewModel
import tiger.com.lp.dailydemo.mvvm.model.User
import tiger.com.lp.dailydemo.utils.LogUtils
import javax.inject.Inject

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
class LoginActivity : BaseActivity(){
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as ApplicationDaily).applicationComponent.loginComponent().create()
        loginComponent.inject(this)

        super.onCreate(savedInstanceState)

        loginViewModel.userRepository.userRemoteDataSource.api.getUser("tigerguixh").enqueue(object :
            Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.body() != null) {
                    LogUtils.i("loginViewModel: ", response.body().toString())
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
            }

        })
    }
}