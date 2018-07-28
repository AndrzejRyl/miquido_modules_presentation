package com.fleenmobile.settings

interface SettingsActivityContract {

  interface View {
    fun showCounter(counter: Int)
    fun getCounter(): Int?
  }

  interface Router {
    fun navigateToMain(counter: Int)
  }

  interface Presenter {
    fun visible(counter: Int?)
    fun onGoBackClicked()
  }
}