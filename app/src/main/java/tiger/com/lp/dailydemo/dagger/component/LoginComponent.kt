package tiger.com.lp.dailydemo.dagger.component

import dagger.Subcomponent
import tiger.com.lp.dailydemo.dagger.annotation.ActivityScope
import tiger.com.lp.dailydemo.ui.LoginActivity

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}