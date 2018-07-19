package com.fleenmobile.core.di

import com.fleenmobile.core.router.ScreenRouter
import com.fleenmobile.core.router.ScreenRouterImpl
import com.fleenmobile.core.utils.resources.ResourceProvider
import com.fleenmobile.core.utils.resources.ResourceProviderImpl
import dagger.Binds
import dagger.Module

@Module
abstract class CoreUtilsModule {
  @Binds
  abstract fun resourceProvider(resourceProvider: ResourceProviderImpl): ResourceProvider

  @Binds
  abstract fun screenRouter(screenRouter: ScreenRouterImpl): ScreenRouter
}