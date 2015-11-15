package com.oyra.svti.svtitest.net;

import com.oyra.svti.svtitest.data.ProgramsList;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class NetworkClient {

    private final String BASE_URL = "http://api.sr.se/api/v2";
    private Api mApi;
    private IDataListener mDataListener;

    public NetworkClient(IDataListener lstnr) {
        mDataListener = lstnr;
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mApi = retrofit.create(Api.class);
    }

    public void getNews(int pageNumber, int pageSize) {
        Call<ProgramsList> call = mApi.getProgramsList(pageNumber, pageSize);
        call.enqueue(new Callback<ProgramsList>() {
            @Override
            public void onResponse(Response<ProgramsList> response, Retrofit retrofit) {
                try {

                    if (response != null && response.isSuccess()) {
                        ProgramsList data = response.body();
                        if (mDataListener != null) {
                            mDataListener.onNewDataLoaded(data);
                        }
                    } else {
                        mDataListener.onLoadingError();
                    }


                } catch (Exception e) {
                    mDataListener.onLoadingError();
                }


            }

            @Override
            public void onFailure(Throwable t) {
                mDataListener.onLoadingError();
            }
        });

    }
}
