package {{ cookiecutter.app_package_name }}

import android.content.Context
{% if cookiecutter.stetho_lib == "y" %}import com.facebook.stetho.Stetho{% endif %}
{% if cookiecutter.leak_canary_lib == "y" %}import com.squareup.leakcanary.LeakCanary{% endif %}
import timber.log.Timber
import javax.inject.Inject

class {{ cookiecutter.app_name }}Application : BaseApplication() {

  @Inject
  lateinit var context: Context

  override fun onCreate() {
    {% if cookiecutter.leak_canary_lib == "y" %}if (LeakCanary.isInAnalyzerProcess(this)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return
    }
    LeakCanary.install(this){% endif %}
    {% if cookiecutter.stetho_lib == "y" %}Stetho.initializeWithDefaults(this){% endif %}
    super.onCreate()
  }

  override fun initTimber() {
    Timber.plant(Timber.DebugTree())
  }
}