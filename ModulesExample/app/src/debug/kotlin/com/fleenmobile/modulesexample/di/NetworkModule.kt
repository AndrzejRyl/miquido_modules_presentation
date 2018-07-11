package com.fleenmobile.modulesexample.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.fleenmobile.core.di.BaseNetworkModule
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule : BaseNetworkModule() {

  @Provides
  fun stethoInterceptor(): Interceptor =
      StethoInterceptor()

  @Singleton
  @Provides
  fun okHttpClient(stethoInterceptor: Interceptor): OkHttpClient =
      OkHttpClient.Builder()
          .addNetworkInterceptor(stethoInterceptor)
          .build()
}