package {{ cookiecutter.app_package_name }}.main.router

import {{ cookiecutter.base_package_name }}.core.router.ScreenRouter
import {{ cookiecutter.app_package_name }}.main.MainActivityContract
import javax.inject.Inject

class MainActivityRouter @Inject constructor(
    private val screenRouter: ScreenRouter
) : MainActivityContract.Router {

}