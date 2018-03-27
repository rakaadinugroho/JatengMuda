package com.joskoding.jatengmuda.di.modules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.joskoding.jatengmuda.App
import com.joskoding.jatengmuda.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by rakaadinugroho on 24/03/18.
 */
@Module class NetworkModule {

    @Provides
    @Singleton
    internal fun provideGson(): Gson{
        return GsonBuilder().serializeNulls().create()
    }

    @Provides
    @Singleton
    internal fun provideOkHttpClient(): OkHttpClient{
        return OkHttpClient.Builder().build()
    }

    @Provides
    @Singleton internal fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory{
        return GsonConverterFactory.create(gson)
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(okHttpClient: OkHttpClient, factory: GsonConverterFactory): Retrofit{
        return Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .client(okHttpClient)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}