package com.oyra.svti.svtitest.activities;

import com.oyra.svti.svtitest.data.Program;

import java.util.List;

public interface IMainView {

    int PAGE_SIZE = 16;

    void showItems(List<Program> items);

    void setLoaded(boolean loaded);

    void setLoading(boolean loading);

    void showProgressBar();

    void hideProgressBar();

    void showError();

    void hideError();

    void openDetails(int pos);


}
