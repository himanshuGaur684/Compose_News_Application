package com.gaur.composenewsapplication.presentation

import com.gaur.composenewsapplication.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean=false,
    val data:List<Article>?=null,
    val error:String=""

)
