package {{ cookiecutter.app_package_name }}

{% if cookiecutter.crashlytics_lib == "y" %}import com.crashlytics.android.Crashlytics{% endif %}
import {{ cookiecutter.app_package_name }}.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
{% if cookiecutter.crashlytics_lib == "y" %}import io.fabric.sdk.android.Fabric{% endif %}

abstract class BaseApplication : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
      DaggerAppComponent.builder().create(this)

  override fun onCreate() {
    super.onCreate()
	{% if cookiecutter.crashlytics_lib == "y" %}Fabric.with(this, Crashlytics()){% endif %}
    initTimber()
  }

  abstract fun initTimber()
}