package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import tiger.com.lp.dailydemo.databinding.ActivityWorkerBinding
import tiger.com.lp.dailydemo.work.UploadLogWorker

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

        binding!!.uploadLog.setOnClickListener {

            var worker = OneTimeWorkRequestBuilder<UploadLogWorker>()
                    .addTag("uploadLog")
                    .build()
            WorkManager.getInstance(this).
            enqueueUniqueWork("upload", ExistingWorkPolicy.KEEP, worker)
        }
    }
}