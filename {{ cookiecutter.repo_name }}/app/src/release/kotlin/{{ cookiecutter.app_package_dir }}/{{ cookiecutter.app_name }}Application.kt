package {{ cookiecutter.app_package_name }}

import timber.log.Timber

class ModulesExampleApplication : BaseApplication() {

  override fun initTimber() {
    Timber.plant(ReleaseTree())
  }
}