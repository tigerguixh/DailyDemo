package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import tiger.com.lp.dailydemo.databinding.ActivityScrollingBinding
import tiger.com.lp.dailydemo.project.adapter.RepoAdapter
import tiger.com.lp.dailydemo.project.layer.MainViewModel
import tiger.com.lp.dailydemo.project.model.RepoList

class TrendingActivity : AppCompatActivity() {
    // 1
    private val viewModel: MainViewModel by viewModels()
    // 2
    private lateinit var binding: ActivityScrollingBinding

    private lateinit var adapter: RepoAdapter
    private val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.loadRepos()
        observeData()
    }

    private fun observeData() {
        // 3
        viewModel.repos.observe(this) {
            display(it)
        }
    }

    private fun display(repoList: RepoList) {
        adapter = RepoAdapter(repoList)
        binding.rv.layoutManager = layoutManager
        binding.rv.adapter = adapter
    }
}