package com.fleenmobile.core.router

import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import com.fleenmobile.core.R
import com.fleenmobile.core.router.ScreenRouter.Companion.INTENT_COUNTER_EXTRA
import com.fleenmobile.core.utils.resources.ResourceProvider
import javax.inject.Inject

class ScreenRouterImpl @Inject constructor(
    private val context: Context,
    private val resourceProvider: ResourceProvider) : ScreenRouter {

  private val scheme = resourceProvider.getString(R.string.navigation_scheme)

  private fun getNavigationIntent(path: String) =
      Intent(ACTION_VIEW, Uri.parse("$scheme://$path"))

  override fun navigateToMain(counter: Int) {
    getNavigationIntent(resourceProvider.getString(R.string.main_activity_path)).apply {
      putExtra(INTENT_COUNTER_EXTRA, counter)
      context.startActivity(this)
    }
  }

  override fun navigateToSettings(counter: Int) {
    getNavigationIntent(resourceProvider.getString(R.string.settings_activity_path)).apply {
      putExtra(INTENT_COUNTER_EXTRA, counter)
      context.startActivity(this)
    }
  }
}