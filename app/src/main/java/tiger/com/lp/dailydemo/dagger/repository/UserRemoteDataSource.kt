package tiger.com.lp.dailydemo.dagger.repository

import tiger.com.lp.dailydemo.mvvm.api.Api
import javax.inject.Inject

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
class UserRemoteDataSource @Inject constructor(var api: Api) {
}