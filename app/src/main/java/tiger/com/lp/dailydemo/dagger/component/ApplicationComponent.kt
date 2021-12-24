package tiger.com.lp.dailydemo.dagger.component

import dagger.Component
import tiger.com.lp.dailydemo.dagger.model.NetworkModule
import tiger.com.lp.dailydemo.dagger.model.SubcomponentsModule
import javax.inject.Singleton

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {
    fun loginComponent(): LoginComponent.Factory
}