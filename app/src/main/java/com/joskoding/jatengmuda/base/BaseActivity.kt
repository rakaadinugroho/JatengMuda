package com.joskoding.jatengmuda.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity

/**
 * Created by rakaadinugroho on 24/03/18.
 */
abstract class BaseActivity<B: ViewDataBinding, T: BaseViewModel<*>> : AppCompatActivity() {
    protected lateinit var dataBinding: B
    protected var baseViewModel: T? = null

    protected fun bindView(layoutId: Int) {
        dataBinding = DataBindingUtil.setContentView(this, layoutId)
    }
    override fun onDestroy() {
        baseViewModel!!.dettachView()
        super.onDestroy()
    }
}