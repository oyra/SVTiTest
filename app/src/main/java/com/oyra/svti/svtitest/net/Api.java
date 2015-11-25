package com.oyra.svti.svtitest.net;

import com.oyra.svti.svtitest.data.ProgramsList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

interface Api {

    @GET("programs?format=json&pagination=true")
    Call<ProgramsList> getProgramsList(@Query("page") int pageNumber, @Query("size") int pageSize);
}
