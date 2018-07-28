package {{ cookiecutter.app_package_name }}.di

import {{ cookiecutter.app_package_name }}.di.module.MainActivityModule
import {{ cookiecutter.app_package_name }}.main.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
  @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
  abstract fun mainActivity(): MainActivity
}