package tiger.com.lp.dailydemo.work

import android.content.Context
import androidx.work.Data
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
        val data = inputData.getString("input_data")
        LogUtils.i("UploadLogWorker", "input data $data, upload log success.")

        val outData = Data.Builder()
            .putString("input_data", "upload success.")
            .build()
        return Result.success(outData)
    }
}