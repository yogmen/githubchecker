package io.github.yogmen.githubchecker.ui.reposlist

import io.github.yogmen.githubchecker.data.network.GitHubRepository
import io.github.yogmen.githubchecker.data.network.GitHubService
import io.github.yogmen.githubchecker.model.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ReposListPresenter(val view: ReposListContract.View,
                         private val gitHubService: GitHubService = GitHubRepository.getGitHubUserService()) : ReposListContract.Presenter {

    init {
        view.presenter = this
    }

    override fun fetchUserRepos(userLogin: String) {
        gitHubService.getUserRepos(userLogin).enqueue(object : Callback<List<Repository>>{
            override fun onFailure(call: Call<List<Repository>>?, t: Throwable?) {
                view.showToast(t?.localizedMessage ?: "Unable to make a call")
            }

            override fun onResponse(call: Call<List<Repository>>, response: Response<List<Repository>>) {
                view.loadRepositories(response.body())
            }

        })
    }

}