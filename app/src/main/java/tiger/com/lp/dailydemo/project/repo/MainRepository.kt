package tiger.com.lp.dailydemo.project.repo

import tiger.com.lp.dailydemo.project.bean.ResultX
import tiger.com.lp.dailydemo.project.data.remote.RemoteRepoDataSource
import tiger.com.lp.dailydemo.project.model.RepoList
import tiger.com.lp.dailydemo.project.network.IRepository
import tiger.com.lp.dailydemo.project.network.RepoDataSource

class MainRepository(
        private val dataSource: RepoDataSource = RemoteRepoDataSource,
        private val localDataSource: RepoDataSource? = null
) : IRepository {
    override suspend fun getRepoList(): ResultX<RepoList> {
        // 暂不处理缓存逻辑
        return dataSource.getRepos()
    }
}