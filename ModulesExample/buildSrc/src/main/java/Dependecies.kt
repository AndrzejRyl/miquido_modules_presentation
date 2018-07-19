object Versions {
  const val compileSdk = 28
  const val minSdk = 19
  const val targetSdk = 28
  const val gradle = "3.1.3"
  const val kotlin = "1.2.30"
  const val support = "27.1.1"
  const val junit = "4.12"
  const val testRunner = "1.0.2"
  const val espresso = "3.0.2"
  const val mockito = "2.16.0"
  const val fabric = "1.+"
  const val crashlytics = "2.9.1"
  const val timber = "4.6.1"
  const val leakCanary = "1.5.4"
  const val dagger2 = "2.14.1"
  const val rxAndroid = "2.0.2"
  const val rxJava = "2.1.11"
  const val retrofit = "2.4.0"
  const val stetho = "1.5.0"
  const val constraintLayout = "1.1.2"
  const val glide = "4.7.1"
  const val joda = "2.9.9"
  const val anko = "0.10.2"
}

object ClassPaths {
  const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradle}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"
}

object Libs {
  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
  const val supportAppcompat = "com.android.support:appcompat-v7:${Versions.support}"
  const val supportRecycler = "com.android.support:recyclerview-v7:${Versions.support}"
  const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
  const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
  const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
  const val dagger2Compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
  const val dagger2Android = "com.google.dagger:dagger-android:${Versions.dagger2}"
  const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2}"
  const val dagger2AndroidCompiler = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
  const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
  const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
  const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
  const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
  const val stethoNetwork = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
  const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
  const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
  const val glideProcessor = "om.github.bumptech.glide:compiler:${Versions.glide}"
  const val joda = "net.danlew:android.joda:${Versions.joda}"
  const val anko = "org.jetbrains.anko:anko:${Versions.anko}"
  const val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
}

object TestLibs {
  const val junit = "junit:junit:${Versions.junit}"
  const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
  const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
  const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
  const val joda = "joda-time:joda-time:${Versions.joda}"
}