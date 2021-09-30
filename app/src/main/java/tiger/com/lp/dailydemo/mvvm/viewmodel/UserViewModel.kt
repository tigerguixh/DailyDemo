package tiger.com.lp.dailydemo.mvvm.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import tiger.com.lp.dailydemo.mvvm.db.UserDatabase
import tiger.com.lp.dailydemo.mvvm.model.User
import tiger.com.lp.dailydemo.mvvm.repository.UserRepository

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/30
 * @Description :
 */
class UserViewModel : AndroidViewModel {
    private var user: LiveData<User>
    private var userRepository: UserRepository
    private var userName: String = "tigerguixh"

    constructor(application: Application) : super(application) {
        var userDao = UserDatabase.getInstance(application).userDao()

        userRepository = UserRepository(userDao)
        user = userRepository.getUser(userName)
    }

    fun getUser() : LiveData<User> {
        return user
    }

    fun refresh() {
        userRepository.refresh(userName)
    }
}