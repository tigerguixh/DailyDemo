package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.work.Data
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import tiger.com.lp.dailydemo.databinding.ActivityWorkerBinding
import tiger.com.lp.dailydemo.utils.LogUtils
import tiger.com.lp.dailydemo.work.UploadLogWorker
import java.util.concurrent.TimeUnit

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/7
 * @Description :
 */
class WorkerActivity : AppCompatActivity() {
    var binding: ActivityWorkerBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWorkerBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)

        var inputData = Data.Builder()
            .putString("input_data", "use worker manager upload log")
            .build()
        var worker = OneTimeWorkRequestBuilder<UploadLogWorker>()
            .addTag("uploadLog")
            .setInputData(inputData)
            .setInitialDelay(5000, TimeUnit.MILLISECONDS)
            .build()

        binding!!.uploadLog.setOnClickListener {
            WorkManager.getInstance(this)
                .enqueueUniqueWork("upload", ExistingWorkPolicy.KEEP, worker)
        }

        binding!!.uploadState.setOnClickListener {
            WorkManager.getInstance(this)
                .getWorkInfoByIdLiveData(worker.id)
                .observe(this, Observer { t ->
                    kotlin.run {
                        var outData = t.outputData.getString("input_data")
                        LogUtils.i("UploadLogWorker", "out data state $outData ,upload log state, " + t.state)
                    }
                })
        }
    }
}