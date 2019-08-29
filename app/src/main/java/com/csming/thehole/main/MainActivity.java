package com.csming.thehole.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModelProviders;
import com.csming.thehole.R;
import com.csming.thehole.main.timeline.adapter.TimelineAdapter;
import com.csming.thehole.main.viewmodel.MainViewModel;
import javax.inject.Inject;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private Toolbar mToolbar;

    private CoordinatorLayout mClRoot;

    private RecyclerView mRvTimeline;
    private RecyclerView.Adapter mTimelineAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Inject
    ViewModelProvider.Factory factory;

    private MainViewModel mMainViewModel;

    public static Intent getIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 全屏显示
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initToolBar();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_info) {
            Snackbar.make(mClRoot, R.string.title_setting, Snackbar.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 初始化ToolBar
     */
    private void initToolBar() {
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowHomeEnabled(false);
        }
    }

    private void initView() {
        mClRoot = findViewById(R.id.cl_root);

        // Init Timeline
        mRvTimeline = findViewById(R.id.rv_timeline);
        mTimelineAdapter = new TimelineAdapter(10);
        mLayoutManager = new LinearLayoutManager(this);
        mRvTimeline.setLayoutManager(mLayoutManager);
        mRvTimeline.setAdapter(mTimelineAdapter);
    }

    private void initData() {
        mMainViewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }
}
