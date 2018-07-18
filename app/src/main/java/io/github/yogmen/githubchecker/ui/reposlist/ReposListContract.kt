package io.github.yogmen.githubchecker.ui.reposlist

import io.github.yogmen.githubchecker.ui.BasePresenter
import io.github.yogmen.githubchecker.ui.BaseView

interface ReposListContract {
    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter{
        fun fetchUserRepos(userLogin: String)
    }
}