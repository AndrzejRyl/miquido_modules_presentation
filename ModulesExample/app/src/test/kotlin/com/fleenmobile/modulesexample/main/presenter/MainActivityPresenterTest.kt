package com.fleenmobile.modulesexample.main.presenter

import com.fleenmobile.core.configuration.Configuration
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

  @Mock
  lateinit var configuration: Configuration

  private val mockCounter = 0
  private lateinit var presenter: MainActivityContract.Presenter

  override fun setup() {
    super.setup()

    presenter = MainActivityPresenter(view, router, configuration)
  }

  override fun tearDown() {
    super.tearDown()
    verifyNoMoreInteractions(view, router, configuration)
  }

  @Test
  fun `should increase counter on plus button click`() {
    mockPositiveCounterResponse()

    presenter.onPlusClicked()

    verify(view, times(1)).showCounter(mockCounter + 1)
  }

  @Test
  fun `should decrease counter on minus button click`() {
    mockPositiveCounterResponse()

    presenter.onMinusClicked()

    verify(view, times(1)).showCounter(mockCounter - 1)
  }

  @Test
  fun `should initialize view`() {
    mockPositiveCounterResponse()
    val counter = 4

    presenter.visible(counter)


    verify(view, times(1)).showCounter(counter)
  }

  private fun mockPositiveCounterResponse() {
    `when`(configuration.counter).thenReturn(mockCounter)
  }

  @Test
  fun `should cache counter on clear`() {
    presenter.clear()

    verify(configuration, times(1)).counter = 0
  }

  @Test
  fun `should navigate to settings on settings button click`() {
    presenter.onSettingsClicked()

    verify(router, times(1)).navigateToSettings(0)
  }
}