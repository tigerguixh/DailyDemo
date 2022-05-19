package tiger.com.lp.dailydemo.project.network

import tiger.com.lp.dailydemo.project.bean.ResultX
import tiger.com.lp.dailydemo.project.model.RepoList

interface RepoDataSource {
    suspend fun getRepos(): ResultX<RepoList>
}

interface IRepository {
    suspend fun getRepoList(): ResultX<RepoList>
}