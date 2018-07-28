package {{ cookiecutter.base_package_name }}.testcore

{% if cookiecutter.rxjava_lib == "y" %}import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers{% endif %}
import org.junit.After
import org.junit.Before
import org.mockito.ArgumentCaptor
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

abstract class BaseTest {

  @Before
  open fun setup() {
    MockitoAnnotations.initMocks(this)
  }

  {% if cookiecutter.rxjava_lib == "y" %}protected fun trampolineRxPlugin() {
    RxAndroidPlugins.setMainThreadSchedulerHandler { Schedulers.trampoline() }
    RxJavaPlugins.setComputationSchedulerHandler { Schedulers.trampoline() }
    RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
    RxJavaPlugins.setSingleSchedulerHandler { Schedulers.trampoline() }
    RxJavaPlugins.setNewThreadSchedulerHandler { Schedulers.trampoline() }
  }{% endif %}

  @After
  open fun tearDown() {
    {% if cookiecutter.rxjava_lib == "y" %}RxAndroidPlugins.reset()
    RxJavaPlugins.reset(){% endif %}
  }

  protected fun <T> any(): T {
    Mockito.any<T>()
    return uninitialized()
  }

  protected fun <T> any(c: Class<T>): T {
    Mockito.any<T>(c)
    return uninitialized()
  }

  protected fun <T> ArgumentCaptor<T>.kCapture(): T {
    capture()
    return uninitialized()
  }

  private fun <T> uninitialized(): T = null as T
}