package com.csming.thehole.common.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: HoleViewModelFactory):
        ViewModelProvider.Factory
}
