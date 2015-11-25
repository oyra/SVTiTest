package com.oyra.svti.svtitest.activities;

import com.oyra.svti.svtitest.net.IDataListener;
import com.oyra.svti.svtitest.data.ProgramsList;
import com.oyra.svti.svtitest.net.NetworkClient;

public class MainPresenter implements IMainPresenter, IDataListener {

    private NetworkClient mClient;
    private IMainView mView;

    private int mLastLoadedPage = 0;

    public MainPresenter(IMainView view) {
        mView = view;
        mClient = new NetworkClient(this);
    }


    public void loadMore() {
        mView.showProgressBar();
        mClient.getNews(mLastLoadedPage + 1, IMainView.PAGE_SIZE);
    }


    @Override
    public void onNewDataLoaded(ProgramsList data) {
        mView.hideProgressBar();
        mView.showItems(data.getPrograms());
        mLastLoadedPage++;
        mView.setLoading(false);
        if (data.getPagination().getPage() >= data.getPagination().getTotalpages()) {
            mView.setLoaded(true);
        }
    }

    @Override
    public void onLoadingError() {
        mView.setLoading(false);
        mView.showError();
    }
}
