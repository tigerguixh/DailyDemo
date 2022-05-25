package tiger.com.lp.dailydemo.project.data.remote

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import tiger.com.lp.dailydemo.project.bean.ResultX
import tiger.com.lp.dailydemo.project.model.RepoList
import tiger.com.lp.dailydemo.project.network.RetrofitClient
import tiger.com.lp.dailydemo.project.network.RepoDataSource

object RemoteRepoDataSource : RepoDataSource {
    const val TAG = "RemoteRepoDataSource"
    override suspend fun getRepos(): ResultX<RepoList> =
            withContext(Dispatchers.IO) {
                try {
                    ResultX.Success(RetrofitClient.service.repos())
                } catch (e: Exception) {
                    Log.e(TAG, e.message, e)
                    ResultX.Error(e)
                }
            }
}