package com.joskoding.jatengmuda

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.joskoding.jatengmuda.di.component.AppsComponent
import com.joskoding.jatengmuda.di.component.DaggerAppsComponent

/**
 * Created by rakaadinugroho on 24/03/18.
 */
class App : Application () {
    companion object {
        lateinit var appsComponent: AppsComponent
    }
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
        appsComponent   = DaggerAppsComponent
                .builder()
                .build()
    }
}