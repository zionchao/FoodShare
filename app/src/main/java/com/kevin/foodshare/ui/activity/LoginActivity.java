package com.kevin.foodshare.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.kevin.foodshare.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangchao_a on 2017/5/29.
 * 登录页面
 */

public class LoginActivity extends BaseActivity{

    @BindView(R.id.register)
    TextView register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.register)
    public void gotoRegister(){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
