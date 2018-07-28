package com.fleenmobile.settings.presenter

import com.fleenmobile.settings.SettingsActivityContract
import com.fleenmobile.testcore.BaseTest
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class SettingsActivityPresenterTest : BaseTest() {

  @Mock
  lateinit var view: SettingsActivityContract.View

  @Mock
  lateinit var router: SettingsActivityContract.Router

  private lateinit var presenter: SettingsActivityContract.Presenter


  override fun setup() {
    super.setup()

    presenter = SettingsActivityPresenter(view, router)
  }

  override fun tearDown() {
    super.tearDown()
    verifyNoMoreInteractions(view, router)
  }

  @Test
  fun `should initialize view`() {
    val counter = 4

    presenter.visible(counter)

    verify(view, times(1)).showCounter(counter)
  }

  @Test
  fun `should navigate to main on button click`() {
    val counter = 7
    `when`(view.getCounter()).thenReturn(counter)

    presenter.onGoBackClicked()

    verify(router, times(1)).navigateToMain(counter)
    verify(view, times(1)).getCounter()
  }

}