package com.kevin.foodshare.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import com.kevin.foodshare.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangchao_a on 2017/5/29.
 * 某个具体订单详情
 */

public class OrderDetailsActivity extends BaseActivity {


    @BindView(R.id.order_button_buy)
    Button order_button_buy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.order_button_buy)
    public void onClick(){
        Intent intent=new Intent(this,OrderSubmitActivity.class);
        startActivity(intent);
    }
}
