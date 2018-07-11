package com.fleenmobile.modulesexample.di

import com.fleenmobile.core.di.BaseNetworkModule
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

class NetworkModule : BaseNetworkModule() {

  @Singleton
  @Provides
  fun okHttpClient(): OkHttpClient =
      OkHttpClient()
}