package com.csming.thehole.di

import com.csming.thehole.common.di.ActivityScoped
import com.csming.thehole.main.MainActivity
import com.csming.thehole.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun mainActivity(): MainActivity
}
