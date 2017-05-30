package com.kevin.foodshare.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import com.kevin.foodshare.R;
import com.kevin.foodshare.ui.adapter.FoodSquareAdapter;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.youth.banner.Banner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 美食广场
 * Created by zhangchao_a on 2017/5/24.
 */

public class FoodSquareFragment extends BaseFragment {

    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.food_list)
    UltimateRecyclerView foodList;

    private FoodSquareAdapter foodSquareAdapter;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_food_square,container,false);
        unbinder=ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        foodSquareAdapter=new FoodSquareAdapter(getActivity());
        foodList.setLayoutManager(new LinearLayoutManager(getActivity()));
        foodList.setAdapter(foodSquareAdapter);

    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
