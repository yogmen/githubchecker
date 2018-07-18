package io.github.yogmen.githubchecker.ui.reposlist

import io.github.yogmen.githubchecker.model.Repository
import io.github.yogmen.githubchecker.ui.BasePresenter
import io.github.yogmen.githubchecker.ui.BaseView

interface ReposListContract {
    interface View : BaseView<Presenter> {
        fun showToast(message: String)
        fun loadRepositories(listOfRepository: List<Repository>?)
    }

    interface Presenter : BasePresenter{
        fun fetchUserRepos(userLogin: String)
    }
}