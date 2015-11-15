package com.oyra.svti.svtitest.stubs;

import com.oyra.svti.svtitest.activities.IMainView;
import com.oyra.svti.svtitest.data.Program;

import java.util.List;

public class FakeMainView implements IMainView {
    int itemsQuantity = 0;

    @Override
    public void showItems(List<Program> items) {
        if (items == null || items.size() == 0) {
            itemsQuantity = 0;
        }
        itemsQuantity = items.size();
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    @Override
    public void setLoaded(boolean loaded) {

    }

    @Override
    public void setLoading(boolean loading) {

    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void hideError() {

    }

    @Override
    public void openDetails(int pos) {

    }
}
