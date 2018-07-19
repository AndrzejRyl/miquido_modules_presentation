package com.fleenmobile.modulesexample.di

import com.fleenmobile.modulesexample.di.module.MainActivityModule
import com.fleenmobile.modulesexample.main.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
  @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
  abstract fun mainActivity(): MainActivity

}