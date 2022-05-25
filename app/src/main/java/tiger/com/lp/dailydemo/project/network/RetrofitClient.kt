package tiger.com.lp.dailydemo.project.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import tiger.com.lp.dailydemo.project.model.RepoList
import java.util.concurrent.TimeUnit

object RetrofitClient {

    private const val TAG = "OkHttp"
    private const val BASE_URL = "https://trendings.herokuapp.com/"
    private const val TIME_OUT = 10

    /*val moshi: Moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }*/

    val service by lazy { getService(RepoService::class.java, BASE_URL) }

    private val client: OkHttpClient by lazy {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
        builder.build()
    }

    private fun <S> getService(
        serviceClass: Class<S>,
        baseUrl: String,
        client: OkHttpClient = this.client
    ): S {
        return Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build().create(serviceClass)
    }
}

interface RepoService {
    @GET("repo")
    suspend fun repos(@Query("lang") lang: String = "Kotlin", @Query("since") since: String = "weekly"): RepoList
}