package com.fleenmobile.modulesexample.main

interface MainActivityContract {

  interface View {
    fun showCounter(counter: Int)
  }

  interface Router {
    fun navigateToSettings()
  }

  interface Presenter{
    fun visible()
    fun onPlusClicked()
    fun onMinusClicked()
    fun clear()
  }
}