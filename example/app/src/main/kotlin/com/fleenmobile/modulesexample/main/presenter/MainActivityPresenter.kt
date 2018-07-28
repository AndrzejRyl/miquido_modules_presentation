package com.fleenmobile.modulesexample.main.presenter

import com.fleenmobile.core.configuration.Configuration
import com.fleenmobile.modulesexample.main.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private val view: MainActivityContract.View,
    private val router: MainActivityContract.Router,
    private val configuration: Configuration
) : MainActivityContract.Presenter {

  private var counter: Int = 0

  override fun visible(counter: Int?) {
    counter?.let {
      this.counter = it
      view.showCounter(it)
    } ?: getCachedCounter()
  }

  private fun getCachedCounter() {
    counter = configuration.counter
    view.showCounter(counter)
  }

  override fun onPlusClicked() = view.showCounter(++counter)

  override fun onMinusClicked() = view.showCounter(--counter)

  override fun onSettingsClicked() = router.navigateToSettings(counter)

  override fun clear() {
    configuration.counter = counter
  }
}