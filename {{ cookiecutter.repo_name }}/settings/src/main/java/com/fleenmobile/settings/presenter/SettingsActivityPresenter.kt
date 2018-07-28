package com.fleenmobile.settings.presenter

import com.fleenmobile.settings.SettingsActivityContract
import javax.inject.Inject

class SettingsActivityPresenter @Inject constructor(
    private val view: SettingsActivityContract.View,
    private val router: SettingsActivityContract.Router
) : SettingsActivityContract.Presenter {

  override fun visible(counter: Int?) = view.showCounter(counter ?: 0)

  override fun onGoBackClicked() = router.navigateToMain(view.getCounter()?: 0)
}