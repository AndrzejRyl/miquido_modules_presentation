package com.fleenmobile.core.di

import android.content.Context
import android.content.SharedPreferences
import com.fleenmobile.core.configuration.Configuration
import com.fleenmobile.core.configuration.ConfigurationImpl
import com.fleenmobile.core.router.ScreenRouter
import com.fleenmobile.core.router.ScreenRouterImpl
import com.fleenmobile.core.utils.resources.ResourceProvider
import com.fleenmobile.core.utils.resources.ResourceProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CoreUtilsModule {

  @Module
  companion object {

    private const val SHARED_PREFERENCES_NAME = "ModulesExamplePreferences"

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