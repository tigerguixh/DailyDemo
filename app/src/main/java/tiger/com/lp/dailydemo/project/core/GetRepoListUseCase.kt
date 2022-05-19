package tiger.com.lp.dailydemo.project.core

import tiger.com.lp.dailydemo.project.bean.ResultX
import tiger.com.lp.dailydemo.project.model.RepoList
import tiger.com.lp.dailydemo.project.network.IRepository
import tiger.com.lp.dailydemo.project.repo.MainRepository

class GetRepoListUseCase(private val repository: IRepository = MainRepository()) {
    suspend operator fun invoke(): ResultX<RepoList> {
        return repository.getRepoList()
    }
}