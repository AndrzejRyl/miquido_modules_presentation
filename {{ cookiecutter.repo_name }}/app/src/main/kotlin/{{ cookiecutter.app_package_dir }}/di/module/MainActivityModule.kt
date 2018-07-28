package {{ cookiecutter.app_package_name }}.di.module

import {{ cookiecutter.app_package_name }}.main.MainActivityContract
import {{ cookiecutter.app_package_name }}.main.presenter.MainActivityPresenter
import {{ cookiecutter.app_package_name }}.main.router.MainActivityRouter
import {{ cookiecutter.app_package_name }}.main.view.MainActivity
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {
  @Binds
  abstract fun mainView(mainView: MainActivity): MainActivityContract.View

  @Binds
  abstract fun mainPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

  @Binds
  abstract fun mainRouter(router: MainActivityRouter): MainActivityContract.Router
}