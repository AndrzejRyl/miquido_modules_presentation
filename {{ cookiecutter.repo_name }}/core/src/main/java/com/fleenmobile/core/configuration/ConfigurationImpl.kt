package com.fleenmobile.core.configuration

import android.content.SharedPreferences
import com.fleenmobile.core.configuration.Configuration.Companion.COUNTER
import javax.inject.Inject

class ConfigurationImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences) : Configuration {

  override var counter: Int
    get() = sharedPreferences.getInt(COUNTER, 0)
    set(value) {
      sharedPreferences.edit()
          .putInt(COUNTER, value)
          .apply()
    }
}