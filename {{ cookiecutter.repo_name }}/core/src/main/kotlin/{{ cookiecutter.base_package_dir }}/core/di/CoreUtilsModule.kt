package {{ cookiecutter.base_package_name }}.core.di

import android.content.Context
import android.content.SharedPreferences
import {{ cookiecutter.base_package_name }}.core.configuration.Configuration
import {{ cookiecutter.base_package_name }}.core.configuration.ConfigurationImpl
import {{ cookiecutter.base_package_name }}.core.router.ScreenRouter
import {{ cookiecutter.base_package_name }}.core.router.ScreenRouterImpl
import {{ cookiecutter.base_package_name }}.core.utils.resources.ResourceProvider
import {{ cookiecutter.base_package_name }}.core.utils.resources.ResourceProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CoreUtilsModule {

  @Module
  companion object {

    private const val SHARED_PREFERENCES_NAME = "{{ cookiecutter.app_name }}Preferences"

    @JvmStatic
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
  }

  @Binds
  abstract fun resourceProvider(resourceProvider: ResourceProviderImpl): ResourceProvider

  @Binds
  abstract fun screenRouter(screenRouter: ScreenRouterImpl): ScreenRouter

  @Binds
  abstract fun configuration(configuration: ConfigurationImpl): Configuration
}