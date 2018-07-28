package {{ cookiecutter.base_package_name }}.core.configuration

import android.content.SharedPreferences
import javax.inject.Inject

class ConfigurationImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences) : Configuration {

}