package {{ cookiecutter.app_package_name }}.di

import android.app.Application
import android.content.Context
import {{ cookiecutter.base_package_name }}.core.di.CoreUtilsModule
import {{ cookiecutter.app_package_name }}.BaseApplication
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Module
abstract class AppModule {

  @Binds
  abstract fun bindContext(application: Application): Context

  @Binds
  abstract fun bindApplication(application: BaseApplication): Application
}

@Singleton
@Component(modules = [
  AndroidSupportInjectionModule::class,
  ActivityBuilder::class,
  AppModule::class,
  CoreUtilsModule::class
])
interface AppComponent : AndroidInjector<BaseApplication> {

  @Component.Builder
  abstract class Builder : AndroidInjector.Builder<BaseApplication>()

}