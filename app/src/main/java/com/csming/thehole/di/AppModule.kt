package com.csming.thehole.di

import android.content.ClipboardManager
import android.content.Context
import android.net.wifi.WifiManager
import com.csming.thehole.HoleApplication
import com.csming.thehole.common.AppExecutors
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: HoleApplication): Context {
        return application.applicationContext
    }

    @Provides
    fun providesWifiManager(context: Context): WifiManager =
        context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

    @Provides
    fun providesClipboardManager(context: Context): ClipboardManager =
        context.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE)
            as ClipboardManager

    @Provides
    fun providesAppExecutors(): AppExecutors {
        return AppExecutors()
    }
}
