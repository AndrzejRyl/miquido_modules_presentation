package {{ cookiecutter.base_package_name }}.core.utils.resources

import android.content.Context
import javax.inject.Inject

class ResourceProviderImpl @Inject constructor(private val context: Context) : ResourceProvider {

  override fun getString(id: Int): String = context.getString(id)

  override fun getString(id: Int, param: String) = context.getString(id, param)
}