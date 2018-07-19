package com.fleenmobile.modulesexample.main.router

import com.fleenmobile.modulesexample.main.MainActivityContract
import com.fleenmobile.modulesexample.main.view.MainActivity
import com.fleenmobile.settings.view.SettingsActivity
import org.jetbrains.anko.startActivity
import javax.inject.Inject

class MainActivityRouter @Inject constructor(
    private val activity: MainActivity
) : MainActivityContract.Router {

  override fun navigateToSettings() {
    activity.startActivity<SettingsActivity>()
  }
}