package com.gaur.composenewsapplication.domain.repository

import com.gaur.composenewsapplication.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle():List<Article>

}