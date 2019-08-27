package com.csming.thehole.main

import androidx.lifecycle.ViewModel
import com.csming.thehole.common.di.ViewModelKey
import com.csming.thehole.main.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}
