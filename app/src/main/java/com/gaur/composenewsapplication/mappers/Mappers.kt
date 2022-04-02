package com.gaur.composenewsapplication.mappers

import com.gaur.composenewsapplication.data.model.ArticleDTO
import com.gaur.composenewsapplication.domain.model.Article


fun List<ArticleDTO>.toDomain():List<Article>{
    return map{
        Article(
            content = it.content?:"",
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}