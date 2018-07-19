package com.fleenmobile.settings.view

import android.content.Intent
import android.os.Bundle
import com.fleenmobile.core.BaseActivity
import com.fleenmobile.core.router.ScreenRouter.Companion.INTENT_COUNTER_EXTRA
import com.fleenmobile.settings.R
import com.fleenmobile.settings.SettingsActivityContract
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : BaseActivity(), SettingsActivityContract.View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)

    initLayout(intent)
  }

  private fun initLayout(intent: Intent?) {
    intent?.let {
      val counter = it.getIntExtra(INTENT_COUNTER_EXTRA, 0)
      counterValue.text = "$counter"
    }
  }
}
