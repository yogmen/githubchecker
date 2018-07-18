package io.github.yogmen.githubchecker.ui.reposlist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.yogmen.githubchecker.R
import io.github.yogmen.githubchecker.adapters.RepositoryListAdapter
import io.github.yogmen.githubchecker.model.Repository
import kotlinx.android.synthetic.main.repos_list_fragment.*
import org.jetbrains.anko.support.v4.toast

class ReposListFragment : Fragment(), ReposListContract.View{

    override lateinit var presenter: ReposListContract.Presenter

    companion object {
        fun newInstance(): ReposListFragment = ReposListFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.repos_list_fragment,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = ReposListPresenter(this)

        repos_list_button_fetch.setOnClickListener { presenter.fetchUserRepos(repos_list_et_user_login.text.toString()) }
    }

    override fun showToast(message: String) {
        toast(message)
    }

    override fun loadRepositories(listOfRepository: List<Repository>?) {
        listOfRepository?.also {
            repos_list.adapter = RepositoryListAdapter(it)
        }
    }
}