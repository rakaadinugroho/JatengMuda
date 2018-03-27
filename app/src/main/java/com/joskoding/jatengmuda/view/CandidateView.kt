package com.joskoding.jatengmuda.view

import com.joskoding.jatengmuda.base.BaseView
import com.joskoding.jatengmuda.models.Candidate

/**
 * Created by rakaadinugroho on 24/03/18.
 */
interface CandidateView: BaseView{
    fun onLoadCandidate(candidate: Candidate)
}