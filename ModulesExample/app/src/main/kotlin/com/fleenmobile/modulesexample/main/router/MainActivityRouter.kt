package com.fleenmobile.modulesexample.main.router

import com.fleenmobile.modulesexample.main.MainActivityContract
import javax.inject.Inject

class MainActivityRouter @Inject constructor() : MainActivityContract.Router {

  override fun navigateToSettings() {
    // todo (use deep link so as not to break dependency between modules)
  }
}