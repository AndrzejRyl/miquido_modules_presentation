package com.fleenmobile.modulesexample.di

import com.fleenmobile.modulesexample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
  @ContributesAndroidInjector()
  abstract fun mainActivity(): MainActivity

}