package {{ cookiecutter.base_package_name }}.core.router

import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import {{ cookiecutter.base_package_name }}.core.R
import {{ cookiecutter.base_package_name }}.core.utils.resources.ResourceProvider
import javax.inject.Inject

class ScreenRouterImpl @Inject constructor(
    private val context: Context,
    private val resourceProvider: ResourceProvider) : ScreenRouter {

  private val scheme = resourceProvider.getString(R.string.navigation_scheme)

  private fun getNavigationIntent(path: String) =
      Intent(ACTION_VIEW, Uri.parse("$scheme://$path")).apply {
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
      }

  override fun navigateToMain() {
    getNavigationIntent(resourceProvider.getString(R.string.main_activity_path)).apply {
      context.startActivity(this)
    }
  }
}