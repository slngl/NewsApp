package com.androiddevs.mvvmnewsapp.data

data class NewsResponse(
    val articles: MutableList<Article?>? = null,
    val status: String? = null,
    val totalResults: Int? = null
)