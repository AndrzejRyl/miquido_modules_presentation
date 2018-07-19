package com.fleenmobile.modulesexample.main.view

import android.os.Bundle
import com.fleenmobile.core.BaseActivity
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

  override fun onResume() {
    super.onResume()
    presenter.visible()
  }

  override fun onPause() {
    super.onPause()
    presenter.clear()
  }

  private fun setupListeners() {
    plusButton.onClick { presenter.onPlusClicked() }
    minusButton.onClick { presenter.onMinusClicked() }
  }

  override fun showCounter(counter: Int) {
    counterValue.text = "$counter"
  }
}