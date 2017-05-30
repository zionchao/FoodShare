package com.kevin.foodshare.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kevin.foodshare.R;
import com.kevin.foodshare.ui.activity.OrderDetailsActivity;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by zhangchao_a on 2017/5/29.
 */

public class FoodSquareAdapter extends UltimateViewAdapter<FoodSquareAdapter.MyViewHolder> {

    private Context context;

    public FoodSquareAdapter(Context context) {
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
                context).inflate(R.layout.fragment_food_square_item, parent,
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
        holder.img_cover.setBackgroundResource(R.drawable.xiaolongxia);
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public class MyViewHolder extends UltimateRecyclerviewViewHolder {

        @BindView(R.id.img_cover)
        ImageView img_cover;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.user_name)
        TextView user_name;
        @BindView(R.id.user_icon)
        CircleImageView user_icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context, OrderDetailsActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
