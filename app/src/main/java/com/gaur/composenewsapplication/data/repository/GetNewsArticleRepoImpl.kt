package com.gaur.composenewsapplication.data.repository

import com.gaur.composenewsapplication.data.network.ApiService
import com.gaur.composenewsapplication.domain.model.Article
import com.gaur.composenewsapplication.domain.repository.GetNewsArticleRepo
import com.gaur.composenewsapplication.mappers.toDomain
import com.gaur.composenewsapplication.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo , SafeApiRequest(){
    override suspend fun getNewsArticle(): List<Article> {
            val response = safeApiRequest { apiService.getNewsArticles() }
            return response?.articles?.toDomain()!!
    }
}