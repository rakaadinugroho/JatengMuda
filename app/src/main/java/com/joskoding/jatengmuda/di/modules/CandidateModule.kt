package com.joskoding.jatengmuda.di.modules

import com.joskoding.jatengmuda.api.ServiceAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rakaadinugroho on 24/03/18.
 */
@Module class CandidateModule @Inject constructor() {
    @Provides
    @Singleton
    internal fun getCandidateList(retrofit: Retrofit): ServiceAPI{
        return retrofit.create<ServiceAPI>(ServiceAPI::class.java)
    }

}