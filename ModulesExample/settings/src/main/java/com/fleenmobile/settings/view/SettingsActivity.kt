package com.fleenmobile.settings.view

import android.os.Bundle
import com.fleenmobile.core.BaseActivity
import com.fleenmobile.core.router.ScreenRouter.Companion.INTENT_COUNTER_EXTRA
import com.fleenmobile.settings.R
import com.fleenmobile.settings.SettingsActivityContract
import kotlinx.android.synthetic.main.activity_settings.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject

class SettingsActivity : BaseActivity(), SettingsActivityContract.View {

  @Inject
  lateinit var presenter: SettingsActivityContract.Presenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)

    initListeners()
  }

  override fun onStart() {
    super.onStart()
    val counter = intent?.getIntExtra(INTENT_COUNTER_EXTRA, 0)
    presenter.visible(counter)
  }

  override fun showCounter(counter: Int) {
    counterValue.setText("$counter")
  }

  override fun getCounter(): Int? = counterValue.text.toString().toIntOrNull()

  private fun initListeners() {
    getBackToMain.onClick { presenter.onGoBackClicked() }
  }
}
