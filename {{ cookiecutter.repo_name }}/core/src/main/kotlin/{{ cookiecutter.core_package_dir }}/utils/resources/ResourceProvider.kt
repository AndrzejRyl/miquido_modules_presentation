package {{ cookiecutter.base_package_name }}.core.utils.resources

import android.support.annotation.StringRes

interface ResourceProvider {

  fun getString(@StringRes id: Int): String
  fun getString(@StringRes id: Int, param: String): String
}