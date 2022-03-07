package tiger.com.lp.dailydemo.kotlin.retrofit.api

import retrofit2.http.Field
import retrofit2.http.GET
import tiger.com.lp.dailydemo.kotlin.retrofit.data.RepoList

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/7
 * @Description :
 */

interface ApiService {
    @GET("/repo")
    fun repos(
        @Field("lang") lang: String,
        @Field("since") since: String
    ): RepoList
}