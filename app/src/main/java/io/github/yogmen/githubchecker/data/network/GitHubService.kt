package io.github.yogmen.githubchecker.data.network

import io.github.yogmen.githubchecker.model.Repository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("{user}/repos")
    fun getUserRepos(@Path("user") userLogin: String): Call<List<Repository>>
}