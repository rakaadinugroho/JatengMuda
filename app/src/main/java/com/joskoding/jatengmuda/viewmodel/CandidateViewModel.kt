package com.joskoding.jatengmuda.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.joskoding.jatengmuda.api.ServiceAPI
import com.joskoding.jatengmuda.base.BaseViewModel
import com.joskoding.jatengmuda.models.Candidate
import com.joskoding.jatengmuda.view.CandidateView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by rakaadinugroho on 24/03/18.
 */
class CandidateViewModel: BaseViewModel<CandidateView>() {
    val subscription: CompositeDisposable
    init {
        subscription    = CompositeDisposable()
    }
    fun getCandidate(serviceAPI: ServiceAPI): LiveData<Candidate> {
        val response    = MutableLiveData<Candidate>()
        subscription.add(
                serviceAPI
                        .getCandidates()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                Consumer { t -> response.postValue(t) },
                                Consumer { t -> view?.onError(throwable = t) },
                                Action { view?.onFinished() }
                        )
        )
        return response
    }
}