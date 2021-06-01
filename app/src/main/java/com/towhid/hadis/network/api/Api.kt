package com.mocat.btb.network.api

import com.towhid.hadis.network.model.response.hadis_book.HadisBookRes
import com.towhid.hadis.network.model.response.hadis_chapter.HadisChapterRes

import retrofit2.Call
import retrofit2.http.*

interface Api {

    @GET("collections")
    fun HadisBookRes_(
        @Query("page") page: Int? = 1,
        @Query("limit") limit: Int? =50
    ): Call<HadisBookRes>


    @GET("collections/{collectionName}/books")
    fun HadisChapterRes_(
        @Path("collectionName") collectionName: String,
        @Query("page") page: Int? = 1,
        @Query("limit") limit: Int? =50
    ): Call<HadisChapterRes>

    @GET("collections/{collectionName}/books/{bookNumber}/hadiths")
    fun HadisListRes_(
        @Path("collectionName") collectionName: String,
        @Path("bookNumber") bookNumber: String,
        @Query("page") page: Int? = 1,
        @Query("limit") limit: Int? =50
    ): Call<HadisChapterRes>

    @GET("collections/{collectionName}/hadiths/{hadithNumber}")
    fun HadisDetailRes_(
        @Path("collectionName") collectionName: String,
        @Path("hadithNumber") bookNumber: String
    ): Call<HadisChapterRes>

}


