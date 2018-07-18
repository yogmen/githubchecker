package io.github.yogmen.githubchecker.ui.reposlist

class ReposListPresenter(val view: ReposListContract.View) : ReposListContract.Presenter {

    init {
        view.presenter = this
    }
}