package io.github.yogmen.githubchecker.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.yogmen.githubchecker.R
import io.github.yogmen.githubchecker.model.Repository
import kotlinx.android.synthetic.main.repository_list_item.view.*

class RepositoryListAdapter(val listOfRepository: List<Repository>) : RecyclerView.Adapter<RepositoryListAdapter.ViewHolder>() {

    var repositoryList : List<Repository> = listOfRepository
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.repository_list_item, parent, false))
    }

    override fun getItemCount(): Int = repositoryList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.repositoryId.text = repositoryList[position].id.toString()
        holder.repositoryName.text = repositoryList[position].name
    }



    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val repositoryName = view.repos_list_item_name
        val repositoryId = view.repos_list_item_id
    }
}