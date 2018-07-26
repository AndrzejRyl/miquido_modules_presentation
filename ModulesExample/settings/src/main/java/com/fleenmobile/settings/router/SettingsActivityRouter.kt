package com.fleenmobile.settings.router

import com.fleenmobile.core.router.ScreenRouter
import com.fleenmobile.settings.SettingsActivityContract
import javax.inject.Inject

class SettingsActivityRouter @Inject constructor(
    private val screenRouter: ScreenRouter
) : SettingsActivityContract.Router {

  override fun navigateToMain(counter: Int) {
    screenRouter.navigateToMain(counter)
  }
}