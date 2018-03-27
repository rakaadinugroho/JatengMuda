package com.joskoding.jatengmuda.di.component

import com.joskoding.jatengmuda.App
import com.joskoding.jatengmuda.activities.authentication.AuthActivity
import com.joskoding.jatengmuda.di.modules.CandidateModule
import com.joskoding.jatengmuda.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by rakaadinugroho on 24/03/18.
 */
@Singleton @Component(modules = arrayOf(CandidateModule::class, NetworkModule::class))
interface AppsComponent {
    fun inject(authActivity: AuthActivity)
}