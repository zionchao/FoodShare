package com.kevin.foodshare.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kevin.foodshare.R;

import butterknife.ButterKnife;

/**
 * Created by zhangchao_a on 2017/5/29.
 * 美食发布页面
 */

public class FoodPublishActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_publish);
        ButterKnife.bind(this);
    }
}
