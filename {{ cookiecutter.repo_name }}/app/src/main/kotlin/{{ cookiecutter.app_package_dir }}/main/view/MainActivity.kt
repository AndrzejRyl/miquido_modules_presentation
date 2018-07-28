package {{ cookiecutter.app_package_name }}.main.view

import android.os.Bundle
import {{ cookiecutter.base_package_name}}.core.BaseActivity
import {{ cookiecutter.app_package_name }}.R
import {{ cookiecutter.app_package_name }}.main.MainActivityContract
import kotlinx.android.synthetic.main.acitivity_main.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityContract.View {

  @Inject
  lateinit var presenter: MainActivityContract.Presenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.acitivity_main)
  }
}