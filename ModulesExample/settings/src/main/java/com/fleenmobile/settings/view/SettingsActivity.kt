package com.fleenmobile.settings.view

import android.os.Bundle
import com.fleenmobile.core.BaseActivity
import com.fleenmobile.settings.R
import com.fleenmobile.settings.SettingsActivityContract

class SettingsActivity : BaseActivity(), SettingsActivityContract.View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)
  }
}
