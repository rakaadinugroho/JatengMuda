package com.joskoding.jatengmuda.api

import com.joskoding.jatengmuda.models.Candidate
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by rakaadinugroho on 24/03/18.
 */
interface ServiceAPI {
    @GET("5ab5da822f000060003617d3")
    fun getCandidates() : Observable<Candidate>
}