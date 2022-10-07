package com.androiddevs.mvvmnewsapp.viewmodels

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.usecases.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}