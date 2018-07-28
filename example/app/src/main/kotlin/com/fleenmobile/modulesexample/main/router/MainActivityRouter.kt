package com.fleenmobile.modulesexample.main.router

import com.fleenmobile.core.router.ScreenRouter
import com.fleenmobile.modulesexample.main.MainActivityContract
import javax.inject.Inject

class MainActivityRouter @Inject constructor(
    private val screenRouter: ScreenRouter
) : MainActivityContract.Router {

  override fun navigateToSettings(counter: Int) {
    screenRouter.navigateToSettings(counter)
  }
}