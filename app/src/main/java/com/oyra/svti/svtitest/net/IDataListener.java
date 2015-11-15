package com.oyra.svti.svtitest.net;

import com.oyra.svti.svtitest.data.ProgramsList;

import java.util.List;

public interface IDataListener {

    void onNewDataLoaded(ProgramsList data);

    void onLoadingError();
}
