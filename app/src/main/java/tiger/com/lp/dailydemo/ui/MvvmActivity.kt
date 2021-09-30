package tiger.com.lp.dailydemo.ui

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import tiger.com.lp.dailydemo.R
import tiger.com.lp.dailydemo.databinding.ActivityMvvmBinding
import tiger.com.lp.dailydemo.mvvm.model.User
import tiger.com.lp.dailydemo.mvvm.viewmodel.UserViewModel
import tiger.com.lp.dailydemo.utils.LogUtils

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/30
 * @Description :
 */
class MvvmActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(ActivityMvvmBinding.inflate(LayoutInflater.from(this)).getRoot())

        //var activityMvvmBinding : ActivityMvvmBinding = DataBindingUtil.setContentView<>(this, R.layout.activity_mvvm)

        val userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        userViewModel.getUser().observe(this,
            Observer<User> {
                if (it != null) {
                    LogUtils.i("ViewModelUser: ", it.toString())
                }
            })
    }
}