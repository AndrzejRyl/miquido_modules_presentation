package com.fleenmobile.modulesexample.di

import android.app.Application
import android.content.Context
import com.fleenmobile.modulesexample.BaseApplication
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Module
abstract class AppModule {

  @Binds
  abstract fun bindContext(application: Application): Context

  @Binds
  abstract fun bindApplication(application: BaseApplication): Application
}

@Singleton
@Component(modules = [
  AndroidInjectionModule::class,
  AppModule::class
])
interface AppComponent : AndroidInjector<BaseApplication> {

  @Component.Builder
  abstract class Builder : AndroidInjector.Builder<BaseApplication>()

}