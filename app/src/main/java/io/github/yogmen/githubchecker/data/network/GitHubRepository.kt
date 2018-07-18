package io.github.yogmen.githubchecker.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GitHubRepository {

    companion object {

        private const val BASE_URL = "https://api.github.com/users/"

        fun getGitHubUserService(): GitHubService {
            return getGitHubNetwork().create(GitHubService::class.java)
        }

        private fun getGitHubNetwork(): Retrofit{
            return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(getGsonConverter())
                    .build()
        }

        private fun getGsonConverter() = GsonConverterFactory.create()
    }



}