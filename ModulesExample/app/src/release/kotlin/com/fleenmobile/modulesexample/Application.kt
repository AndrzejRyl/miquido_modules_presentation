package com.fleenmobile.modulesexample

import timber.log.Timber

class Application : BaseApplication() {

  override fun initTimber() {
    Timber.plant(ReleaseTree())
  }
}