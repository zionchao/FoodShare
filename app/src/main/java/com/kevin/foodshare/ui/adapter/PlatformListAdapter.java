package com.kevin.foodshare.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.kevin.foodshare.R;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by zhangchao_a on 2017/5/29.
 */

public class PlatformListAdapter extends UltimateViewAdapter<PlatformListAdapter.MyViewHolder> {

    private Context context;

    public PlatformListAdapter(Context context) {
        super();
        this.context=context;
    }

    @Override
    public MyViewHolder newFooterHolder(View view) {
       return null;
    }

    @Override
    public MyViewHolder newHeaderHolder(View view) {
        return null;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.adapter_platform_item, parent,
                false));
        return holder;
    }

    @Override
    public int getAdapterItemCount() {
        return 10;
    }

    @Override
    public long generateHeaderId(int position) {
        return 0;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (position%2==0){
            holder.img_icon.setBackgroundResource(R.drawable.ali_pay);
        }else
            holder.img_icon.setBackgroundResource(R.drawable.wechat_pay);
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public class MyViewHolder extends UltimateRecyclerviewViewHolder {

        @BindView(R.id.img_icon)
        ImageView img_icon;
        @BindView(R.id.txt_name)
        TextView txt_name;
        @BindView(R.id.radio)
        RadioButton user_name;


        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
