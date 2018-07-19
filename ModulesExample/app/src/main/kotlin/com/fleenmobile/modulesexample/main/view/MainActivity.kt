package com.fleenmobile.modulesexample.main.view

import android.os.Bundle
import com.fleenmobile.core.BaseActivity
import com.fleenmobile.core.router.ScreenRouter.Companion.INTENT_COUNTER_EXTRA
import com.fleenmobile.modulesexample.R
import com.fleenmobile.modulesexample.main.MainActivityContract
import kotlinx.android.synthetic.main.acitivity_main.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityContract.View {

  @Inject
  lateinit var presenter: MainActivityContract.Presenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.acitivity_main)

    setupListeners()
  }

  override fun onStart() {
    super.onStart()
    val counter = when (intent?.hasExtra(INTENT_COUNTER_EXTRA)) {
      true -> intent.getIntExtra(INTENT_COUNTER_EXTRA, 0)
      else -> null
    }
    presenter.visible(counter)
  }

  override fun onStop() {
    super.onStop()
    presenter.clear()
  }

  private fun setupListeners() {
    plusButton.onClick { presenter.onPlusClicked() }
    minusButton.onClick { presenter.onMinusClicked() }
    settingsButton.onClick { presenter.onSettingsClicked() }
  }

  override fun showCounter(counter: Int) {
    counterValue.text = "$counter"
  }
}