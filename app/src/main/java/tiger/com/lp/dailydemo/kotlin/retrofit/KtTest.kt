package tiger.com.lp.dailydemo.kotlin.retrofit

import tiger.com.lp.dailydemo.kotlin.retrofit.api.ApiService
import tiger.com.lp.dailydemo.kotlin.retrofit.data.RepoList
import kotlin.coroutines.suspendCoroutine

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/18
 * @Description :
 */
class KtTest {
}

fun main() {
    // 同步代码
    val api: ApiService = KtHttpV2.create(ApiService::class.java)
    val data: RepoList = api.repos(lang = "Kotlin", since = "weekly")
    println (data)
}

