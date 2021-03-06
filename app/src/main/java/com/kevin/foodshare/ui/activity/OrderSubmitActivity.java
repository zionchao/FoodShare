package com.kevin.foodshare.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kevin.foodshare.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangchao_a on 2017/5/29.
 * 某个具体订单详情
 */

public class OrderSubmitActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall_order_submit);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.mall_order_button_submit)
    public void submit(){
        Intent intent=new Intent(this,PaymentActivity.class);
        startActivity(intent);
    }
}
