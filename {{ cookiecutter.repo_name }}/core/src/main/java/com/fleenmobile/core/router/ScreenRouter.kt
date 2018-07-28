package com.fleenmobile.core.router

interface ScreenRouter {

  companion object {
    const val INTENT_COUNTER_EXTRA = "counter"
  }

  fun navigateToMain(counter: Int)

  fun navigateToSettings(counter: Int)
}