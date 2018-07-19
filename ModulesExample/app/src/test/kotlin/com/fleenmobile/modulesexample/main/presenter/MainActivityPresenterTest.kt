package com.fleenmobile.modulesexample.main.presenter

import com.fleenmobile.modulesexample.main.MainActivityContract
import com.fleenmobile.testcore.BaseTest
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class MainActivityPresenterTest : BaseTest() {

  @Mock
  lateinit var view: MainActivityContract.View

  @Mock
  lateinit var router: MainActivityContract.Router

  private val mockCounter = 0
  private lateinit var presenter: MainActivityContract.Presenter

  override fun setup() {
    super.setup()

    presenter = MainActivityPresenter(view, router)
  }

  override fun tearDown() {
    super.tearDown()
    verifyNoMoreInteractions(view, router)
  }

  @Test
  fun `should increase counter on plus button click`() {
    mockPositiveCounterResponse() // TODO mock caching service when it's implemented

    presenter.onPlusClicked()

    verify(view, times(1)).showCounter(mockCounter + 1)
  }

  @Test
  fun `should decrease counter on minus button click`() {
    mockPositiveCounterResponse() // TODO mock caching service when it's implemented

    presenter.onMinusClicked()

    verify(view, times(1)).showCounter(mockCounter - 1)
  }

  @Test
  fun `should initialize view`() {
    mockPositiveCounterResponse() // TODO mock caching service when it's implemented

    presenter.visible()


    verify(view, times(1)).showCounter(mockCounter)
  }

  private fun mockPositiveCounterResponse() {
    // TODO mock caching service when it's implemented
  }

  @Test
  fun `should cache counter on clear`() {
    presenter.clear()

    // todo add verification for caching service
  }

  @Test
  fun `should navigate to settings on settings button click`() {
    presenter.onSettingsClicked()

    verify(router, times(1)).navigateToSettings()
  }
}