package com.gaur.composenewsapplication.domain.model

import com.gaur.composenewsapplication.data.model.SourceDTO

data class Article(

    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String

)
