package {{ cookiecutter.app_package_name }}.main.presenter

import {{ cookiecutter.app_package_name }}.main.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private val view: MainActivityContract.View,
    private val router: MainActivityContract.Router
) : MainActivityContract.Presenter {

}