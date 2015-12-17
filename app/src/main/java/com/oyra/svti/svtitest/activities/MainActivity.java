package com.oyra.svti.svtitest.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.oyra.svti.svtitest.R;
import com.oyra.svti.svtitest.adapter.ListAdapter;
import com.oyra.svti.svtitest.data.Program;
import com.oyra.svti.svtitest.ui.IRecyclerItemClickListener;
import com.oyra.svti.svtitest.ui.RecyclerViewItemTouchListener;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView, IRecyclerItemClickListener {

    @SuppressWarnings("FieldCanBeLocal")
    private final int NUM_OF_COLUMNS = 2;
    private IMainPresenter mPresenter;
    private ProgressBar mProgress;
    private RecyclerView mList;
    private GridLayoutManager mLayoutManager;
    private ListAdapter mAdapter;
    private TextView mErrorText;
    private boolean mLoading = false;
    private boolean mLoaded = false;
    private RecyclerViewItemTouchListener mOnItemTouchListener;


    private RecyclerView.OnScrollListener mOnScrollListener = new OnScrollListener() {

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);

            if (mLoaded) {
                return;
            }

            int visibleItemCount = mLayoutManager.getChildCount();
            int totalItemCount = mLayoutManager.getItemCount();
            int firstVisibleItemPosition = mLayoutManager.findFirstVisibleItemPosition();

            if (!mLoading && !mLoaded) {
                if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                        && firstVisibleItemPosition >= 0
                        && totalItemCount >= PAGE_SIZE) {
                    mLoading = true;
                    loadMoreItems();
                }
            }
        }

    };


    @Override
    public void onClick(View view, int pos) {
        openDetails(pos);
    }


    private void loadMoreItems() {
        mPresenter.loadMore();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initColors();
        mPresenter = new MainPresenter(this);
        init();
        loadMoreItems();
    }

    private void init() {
        mProgress = (ProgressBar) findViewById(R.id.progress);

        mList = (RecyclerView) findViewById(R.id.list);
        mList.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, NUM_OF_COLUMNS);
        mList.setLayoutManager(mLayoutManager);
        mAdapter = new ListAdapter();
        mList.setAdapter(mAdapter);
        mList.addOnScrollListener(mOnScrollListener);
        mOnItemTouchListener = new RecyclerViewItemTouchListener(this, this);
        mList.addOnItemTouchListener(mOnItemTouchListener);

        mErrorText = (TextView) findViewById(R.id.error_text);
        mErrorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //try again
                if (mAdapter.getItemCount() == 0) {
                    hideError();
                    loadMoreItems();

                }

            }
        });
    }

    private void initColors() {
        if (Build.VERSION.SDK_INT > 21) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mOnScrollListener = null;
        if (mOnItemTouchListener != null) {
            mOnItemTouchListener.close();
            mOnItemTouchListener = null;
        }


    }

    @Override
    public void showItems(List<Program> items) {
        mAdapter.addAll(items);
    }

    @Override
    public void setLoaded(boolean loaded) {
        mLoaded = loaded;
    }

    @Override
    public void setLoading(boolean loading) {
        mLoading = loading;
    }

    @Override
    public void showProgressBar() {
        mProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        mProgress.setVisibility(View.GONE);
    }

    @Override
    public void showError() {
        if (mAdapter.getItemCount() == 0) {
            mList.setVisibility(View.GONE);
            mErrorText.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideError() {
        mList.setVisibility(View.VISIBLE);
        mErrorText.setVisibility(View.GONE);
    }

    @Override
    public void openDetails(int pos) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("program", mAdapter.getItem(pos));
        ActivityCompat.startActivity(MainActivity.this, intent, null);
    }
}
