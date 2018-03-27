package com.joskoding.jatengmuda.base

/**
 * Created by rakaadinugroho on 24/03/18.
 */
interface BaseView {
    fun onLoading()
    fun onFinished()
    fun onError(throwable: Throwable)
    fun onErrorFatal(throwable: Throwable)
}