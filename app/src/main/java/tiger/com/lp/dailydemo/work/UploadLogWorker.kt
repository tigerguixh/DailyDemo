package tiger.com.lp.dailydemo.work

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import tiger.com.lp.dailydemo.utils.LogUtils

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/7
 * @Description :
 */
class UploadLogWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {
    override fun doWork(): Result {
        LogUtils.i("UploadLogWorker", "upload log success.")
        return Result.success()
    }
}