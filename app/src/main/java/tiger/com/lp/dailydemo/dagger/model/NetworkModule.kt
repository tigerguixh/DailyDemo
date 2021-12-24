package tiger.com.lp.dailydemo.dagger.model

import dagger.Module
import dagger.Provides
import tiger.com.lp.dailydemo.mvvm.api.Api
import tiger.com.lp.dailydemo.network.ApiFactory
import javax.inject.Singleton

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideApi(): Api {
        return ApiFactory.getInstance()
            .create(Api::class.java)
    }
}