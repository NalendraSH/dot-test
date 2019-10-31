package com.dottest.api

import com.dottest.model.ListData
import retrofit2.http.GET
import rx.Observable

interface ApiService{

    @GET("ListData.json")
    fun getListData(): Observable<ListData.ListDataResponse>

}