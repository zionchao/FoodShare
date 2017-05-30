package com.kevin.foodshare.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.kevin.foodshare.R;
import com.kevin.foodshare.ui.adapter.PlatformListAdapter;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;

import java.util.List;

/**
 * author: cheikh.wang on 17/1/5
 * email: wanghonghi@126.com
 */

public class PaymentActivity extends BaseActivity{

    @BindView(R.id.recycler_view)
    UltimateRecyclerView mRecyclerView;

    @BindView(R.id.btn_payment)
    Button mBtnPayment;

    private PlatformListAdapter mAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ButterKnife.bind(this);
        initializeViews();
    }

    protected void initializeViews() {
        mAdapter = new PlatformListAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }



    @OnClick({R.id.btn_payment})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_payment:
                payment();
                break;
        }
    }

    /**
     * 执行付款操作
     */
    private void payment() {
        // 获取选择的支付平台
//        int selectedPosition = mAdapter.getSelectedPosition();
//        PaymentPlatform platform = mAdapter.getItem(selectedPosition);
//
//        showLoading(R.string.label_being_simulate_payment);
//        mBtnPayment.setEnabled(false);
//        getCallbacks().payment(mOrder, platform.getId());
    }

}