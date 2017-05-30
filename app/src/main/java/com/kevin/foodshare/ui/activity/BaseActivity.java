package com.kevin.foodshare.ui.activity;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.kevin.foodshare.R;

/**
 * Created by zhangchao_a on 2017/5/29.
 */

public class BaseActivity extends AppCompatActivity {

    public Toolbar mToolbar;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        initToolBar();
    }

    private void initToolBar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setCollapsible(false);
    }
}
