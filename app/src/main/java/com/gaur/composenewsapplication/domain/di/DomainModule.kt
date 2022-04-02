package com.gaur.composenewsapplication.domain.di

import com.gaur.composenewsapplication.data.network.ApiService
import com.gaur.composenewsapplication.data.repository.GetNewsArticleRepoImpl
import com.gaur.composenewsapplication.domain.repository.GetNewsArticleRepo
import com.gaur.composenewsapplication.domain.use_case.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {


    @Provides
    fun provideGetNewsRepo(apiService: ApiService):GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService = apiService)
    }



}