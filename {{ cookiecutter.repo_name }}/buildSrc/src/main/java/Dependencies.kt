object Versions {
  const val compileSdk = 28
  const val minSdk = 19
  const val targetSdk = 28
  const val gradle = "3.1.3"
  const val kotlin = "1.2.30"
  const val support = "27.1.1"
  const val junit = "4.12"
  const val mockito = "2.16.0"
  {% if cookiecutter.crashlytics_lib == "y" %}const val fabric = "1.+"{% endif %}
  {% if cookiecutter.crashlytics_lib == "y" %}const val crashlytics = "2.9.1"{% endif %}
  const val timber = "4.6.1"
  {% if cookiecutter.leak_canary_lib == "y" %}const val leakCanary = "1.5.4"{% endif %}
  const val dagger2 = "2.14.1"
  {% if cookiecutter.rxandroid_lib == "y" %}const val rxAndroid = "2.0.2"{% endif %}
  {% if cookiecutter.rxjava_lib == "y" %}const val rxJava = "2.1.11"{% endif %}
  {% if cookiecutter.stetho_lib == "y" %}const val stetho = "1.5.0"{% endif %}
  {% if cookiecutter.constraint_layout_lib == "y" %}const val constraintLayout = "1.1.2"{% endif %}
  const val anko = "0.10.2"
}

object ClassPaths {
  const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradle}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  {% if cookiecutter.crashlytics_lib == "y" %}const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"{% endif %}
}

object Libs {
  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
  const val supportAppcompat = "com.android.support:appcompat-v7:${Versions.support}"
  const val supportRecycler = "com.android.support:recyclerview-v7:${Versions.support}"
  {% if cookiecutter.crashlytics_lib == "y" %}const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"{% endif %}
  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
  {% if cookiecutter.leak_canary_lib == "y" %}const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"{% endif %}
  const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
  const val dagger2Compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
  const val dagger2Android = "com.google.dagger:dagger-android:${Versions.dagger2}"
  const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2}"
  const val dagger2AndroidCompiler = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
  {% if cookiecutter.rxandroid_lib == "y" %}const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"{% endif %}
  {% if cookiecutter.rxjava_lib == "y" %}const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"{% endif %}
  {% if cookiecutter.stetho_lib == "y" %}const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"{% endif %}
  {% if cookiecutter.stetho_lib == "y" %}const val stethoNetwork = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"{% endif %}
  {% if cookiecutter.constraint_layout_lib == "y" %}const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"{% endif %}
  const val anko = "org.jetbrains.anko:anko:${Versions.anko}"
  const val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
}

object TestLibs {
  const val junit = "junit:junit:${Versions.junit}"
  const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
}