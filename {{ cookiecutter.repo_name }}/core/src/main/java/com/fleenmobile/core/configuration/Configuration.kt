package com.fleenmobile.core.configuration

interface Configuration {

  companion object {
    const val COUNTER = "counter"
  }

  var counter: Int
}