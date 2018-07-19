package com.fleenmobile.settings.di

import com.fleenmobile.settings.SettingsActivityContract
import com.fleenmobile.settings.presenter.SettingsActivityPresenter
import com.fleenmobile.settings.router.SettingsActivityRouter
import com.fleenmobile.settings.view.SettingsActivity
import dagger.Binds
import dagger.Module

@Module
abstract class SettingsActivityModule {
  @Binds
  abstract fun settingsView(settingsView: SettingsActivity): SettingsActivityContract.View

  @Binds
  abstract fun settingsPresenter(presenter: SettingsActivityPresenter): SettingsActivityContract.Presenter

  @Binds
  abstract fun settingsRouter(router: SettingsActivityRouter): SettingsActivityContract.Router
}