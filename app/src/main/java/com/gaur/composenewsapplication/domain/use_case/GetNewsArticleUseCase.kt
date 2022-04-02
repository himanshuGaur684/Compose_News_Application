package com.gaur.composenewsapplication.domain.use_case

import com.gaur.composenewsapplication.domain.model.Article
import com.gaur.composenewsapplication.domain.repository.GetNewsArticleRepo
import com.gaur.composenewsapplication.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading(""))
         try{
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))

        }catch (e:Exception){
            emit(Resource.Error(e.message))
        }

    }

}