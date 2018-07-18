package io.github.yogmen.githubchecker.ui.reposlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.yogmen.githubchecker.R

class ReposListActivity : AppCompatActivity() {
    private lateinit var presenter: ReposListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.repos_list_activity)

        val reposListFragment = supportFragmentManager.findFragmentById(R.id.respos_list_container) as ReposListFragment? ?: ReposListFragment.newInstance().also {
            supportFragmentManager.beginTransaction().add(R.id.respos_list_container, it).commit()
        }

        presenter = ReposListPresenter(reposListFragment)
    }
}