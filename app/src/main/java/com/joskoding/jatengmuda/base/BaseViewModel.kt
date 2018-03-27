package com.joskoding.jatengmuda.base

import android.arch.lifecycle.ViewModel

/**
 * Created by rakaadinugroho on 24/03/18.
 */
open class BaseViewModel<T> : ViewModel() {
    var view: T? = null

    fun attachView(view: T){
        this.view   = view
    }

    fun dettachView(){
        this.view   = null
    }
}