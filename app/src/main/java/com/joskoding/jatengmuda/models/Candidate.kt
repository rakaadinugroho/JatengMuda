package com.joskoding.jatengmuda.models

/**
 * Created by rakaadinugroho on 24/03/18.
 */

data class Candidate(
		val status: String,
		val kandidat: List<Kandidat>
)

data class Kandidat(
		val kandidat_id: Int,
		val cagub: String,
		val cawagub: String,
		val pengusung: List<String>
)