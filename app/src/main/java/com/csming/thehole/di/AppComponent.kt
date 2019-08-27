package com.csming.thehole.di

import com.csming.thehole.HoleApplication
import com.csming.thehole.common.di.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        RepositoryModule::class,
        ActivityBindingModule::class,
        ViewModelModule::class]
)
interface AppComponent : AndroidInjector<HoleApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<HoleApplication>()
}
