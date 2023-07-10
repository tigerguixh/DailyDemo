package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tiger.com.lp.dailydemo.databinding.ActivityMvvmBinding
import tiger.com.lp.dailydemo.mvvm.api.Api
import tiger.com.lp.dailydemo.mvvm.model.Notice
import tiger.com.lp.dailydemo.mvvm.model.Token
import tiger.com.lp.dailydemo.network.ApiFactory
import tiger.com.lp.dailydemo.utils.LogUtils
import java.util.concurrent.TimeUnit
import kotlin.random.Random

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/8/24
 * @Description :
 */
class VyfiActivity : AppCompatActivity() {
    val handle = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(ActivityMvvmBinding.inflate(LayoutInflater.from(this)).getRoot())

        Observable.interval(0, 30, TimeUnit.SECONDS) // 修改为主线程调用，防止在调用过程中子线程被销毁报错
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext { o: Long? -> loadData() }
            .subscribe()
    }

    fun loadData() {
        val time = Random.nextInt(10)
        handle.postDelayed({
            refresh()
        }, time.toLong())
    }

    fun refresh() {
        val url = "https://api.vyfi.io/token?networkId=1"
        ApiFactory.getInstance()
            .create(Api::class.java)
            .getVifiNotice(url)
            .enqueue(object : Callback<List<Token>> {
                override fun onResponse(call: Call<List<Token>>, response: Response<List<Token>>) {
                    val notice = response.body()
                    if (!notice.isNullOrEmpty()) {
                        notice.forEach {
                            if (it.assetName.equals("ANON", true)
                                || it.assetName.equals("vyfi", true)
                            ) {
                                Toast.makeText(
                                    this@VyfiActivity,
                                    "${it.assetName}上线啦",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }
                    }
                }

                override fun onFailure(call: Call<List<Token>>, t: Throwable) {
                }

            })
    }
}