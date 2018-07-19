package com.fleenmobile.modulesexample.main.presenter

import com.fleenmobile.modulesexample.main.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private val view: MainActivityContract.View,
    private val router: MainActivityContract.Router
) : MainActivityContract.Presenter {

  private var counter: Int = 0

  override fun visible(counter: Int?) {
    counter?.let {
      this.counter = it
      view.showCounter(it)
    }// todo get cached value
  }

  override fun onPlusClicked() = view.showCounter(++counter)

  override fun onMinusClicked() = view.showCounter(--counter)

  override fun onSettingsClicked() = router.navigateToSettings(counter)

  override fun clear() {
    // todo cache counter
  }
}