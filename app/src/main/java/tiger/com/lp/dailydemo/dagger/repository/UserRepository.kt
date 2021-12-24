package tiger.com.lp.dailydemo.dagger.repository

import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Singleton
class UserRepository @Inject constructor(
    val userLocalDataSource: UserLocalDataSource,
    val userRemoteDataSource: UserRemoteDataSource
) {
}