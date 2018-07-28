package com.fleenmobile.modulesexample.di.module

import com.fleenmobile.modulesexample.main.MainActivityContract
import com.fleenmobile.modulesexample.main.presenter.MainActivityPresenter
import com.fleenmobile.modulesexample.main.router.MainActivityRouter
import com.fleenmobile.modulesexample.main.view.MainActivity
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {
  @Binds
  abstract fun mainView(mainView: MainActivity): MainActivityContract.View

  @Binds
  abstract fun mainPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

  @Binds
  abstract fun mainRouter(router: MainActivityRouter): MainActivityContract.Router
}