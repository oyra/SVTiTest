package com.oyra.svti.svtitest.net;

import com.oyra.svti.svtitest.data.ProgramsList;

public interface IDataListener {

    void onNewDataLoaded(ProgramsList data);

    void onLoadingError();
}
