package com.towhid.hadis.network.model.response.hadis_list

data class Data (
	val collection : String,
	val bookNumber : String,
	val hadithNumber : String,
	val hadith : List<Hadith>
)