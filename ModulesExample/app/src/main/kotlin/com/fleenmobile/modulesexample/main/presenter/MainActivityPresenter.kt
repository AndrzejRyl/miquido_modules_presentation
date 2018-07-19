package com.fleenmobile.modulesexample.main.presenter

import com.fleenmobile.modulesexample.main.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    val view: MainActivityContract.View
) : MainActivityContract.Presenter {

  private var counter: Int = 0

  override fun visible() {
    // todo get cached value
    view.showCounter(counter)
  }

  override fun onPlusClicked() = view.showCounter(++counter)

  override fun onMinusClicked() = view.showCounter(--counter)

  override fun clear() {
    // todo cache counter
  }
}