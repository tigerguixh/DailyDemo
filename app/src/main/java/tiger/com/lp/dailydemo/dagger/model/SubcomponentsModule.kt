package tiger.com.lp.dailydemo.dagger.model

import dagger.Module
import tiger.com.lp.dailydemo.dagger.component.LoginComponent

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule {
}