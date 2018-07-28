package com.fleenmobile.modulesexample

import android.content.Context
import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber
import javax.inject.Inject

class ModulesExampleApplication : BaseApplication() {

  @Inject
  lateinit var context: Context

  override fun onCreate() {
    if (LeakCanary.isInAnalyzerProcess(this)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return
    }
    LeakCanary.install(this)
    Stetho.initializeWithDefaults(this)
    super.onCreate()
  }

  override fun initTimber() {
    Timber.plant(Timber.DebugTree())
  }
}