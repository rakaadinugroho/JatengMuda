package com.joskoding.jatengmuda.activities.authentication

import android.os.Bundle
import com.joskoding.jatengmuda.App
import com.joskoding.jatengmuda.R
import com.joskoding.jatengmuda.api.ServiceAPI
import com.joskoding.jatengmuda.base.BaseActivity
import com.joskoding.jatengmuda.databinding.ActivityAuthBinding
import com.joskoding.jatengmuda.models.Candidate
import com.joskoding.jatengmuda.view.CandidateView
import com.joskoding.jatengmuda.viewmodel.CandidateViewModel
import javax.inject.Inject

class AuthActivity : BaseActivity<ActivityAuthBinding, CandidateViewModel>(), CandidateView {
    @Inject lateinit var serviceAPI: ServiceAPI;

    override fun onLoading() {

    }

    override fun onFinished() {

    }

    override fun onError(throwable: Throwable) {

    }

    override fun onErrorFatal(throwable: Throwable) {

    }

    override fun onLoadCandidate(candidate: Candidate) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.appsComponent.inject(this)
        bindView(R.layout.activity_auth)
        baseViewModel   = CandidateViewModel()
        baseViewModel!!.attachView(this)
    }

}
