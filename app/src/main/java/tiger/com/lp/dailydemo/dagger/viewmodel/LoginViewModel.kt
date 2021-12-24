package tiger.com.lp.dailydemo.dagger.viewmodel

import tiger.com.lp.dailydemo.dagger.annotation.ActivityScope
import tiger.com.lp.dailydemo.dagger.repository.UserRepository
import javax.inject.Inject

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@ActivityScope
class LoginViewModel @Inject constructor(var userRepository: UserRepository) {
}