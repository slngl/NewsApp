package com.androiddevs.mvvmnewsapp.usecases

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(serchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(serchQuery, pageNumber)
}