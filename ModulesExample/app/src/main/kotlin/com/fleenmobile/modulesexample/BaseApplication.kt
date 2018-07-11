package com.fleenmobile.modulesexample

import com.fleenmobile.modulesexample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

abstract class BaseApplication : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
      DaggerAppComponent.builder().create(this)

  override fun onCreate() {
    super.onCreate()
    initTimber()
  }

  abstract fun initTimber()
}