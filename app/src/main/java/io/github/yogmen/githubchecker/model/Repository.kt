package io.github.yogmen.githubchecker.model

data class Repository (
        val id: Long,
        val name: String,
        val full_name: String,
        val private: Boolean,
        val fork: Boolean,
        val description: String
)