package com.fleenmobile.modulesexample

import timber.log.Timber

class ModulesExampleApplication : BaseApplication() {

  override fun initTimber() {
    Timber.plant(ReleaseTree())
  }
}