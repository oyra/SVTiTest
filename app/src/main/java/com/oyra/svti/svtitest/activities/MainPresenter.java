package com.oyra.svti.svtitest.activities;

import com.oyra.svti.svtitest.data.ProgramsList;
import com.oyra.svti.svtitest.net.IDataListener;
import com.oyra.svti.svtitest.net.NetworkClient;

import java.lang.ref.WeakReference;

public class MainPresenter implements IMainPresenter, IDataListener {

    private NetworkClient mClient;
    private WeakReference<IMainView> mView;

    private int mLastLoadedPage = 0;

    public MainPresenter(IMainView view) {
        mView = new WeakReference<>(view);
        mClient = new NetworkClient(this);
    }


    public void loadMore() {
        if (mView.get() != null) {
            mView.get().showProgressBar();
        }
        mClient.getNews(mLastLoadedPage + 1, IMainView.PAGE_SIZE);
    }


    @Override
    public void onNewDataLoaded(ProgramsList data) {
        if (mView.get() != null) {
            mView.get().hideProgressBar();
            mView.get().showItems(data.getPrograms());

            mLastLoadedPage++;
            mView.get().setLoading(false);
            if (data.getPagination().getPage() >= data.getPagination().getTotalpages()) {
                mView.get().setLoaded(true);
            }
        }
    }

    @Override
    public void onLoadingError() {
        if (mView.get() != null) {
            mView.get().setLoading(false);
            mView.get().showError();
        }
    }
}
