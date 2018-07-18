package io.github.yogmen.githubchecker.ui.reposlist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.yogmen.githubchecker.R

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
    }

}