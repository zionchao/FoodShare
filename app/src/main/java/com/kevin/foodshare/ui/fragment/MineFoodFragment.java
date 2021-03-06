package com.kevin.foodshare.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.kevin.foodshare.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 我的美食
 * Created by zhangchao_a on 2017/5/24.
 */

public class MineFoodFragment extends BaseFragment {

    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mine_food,container,false);
        unbinder=ButterKnife.bind(this, view);
        return view;
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
