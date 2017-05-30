package com.kevin.foodshare;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.kevin.foodshare.ui.activity.BaseActivity;
import com.kevin.foodshare.ui.fragment.FoodSquareFragment;
import com.kevin.foodshare.ui.fragment.MineFoodFragment;
import com.kevin.foodshare.ui.fragment.OrderCenterFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.content)
    public FrameLayout content;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager=getSupportFragmentManager();
            switch (item.getItemId()) {
                case R.id.navigation_food_square:
//                    mTextMessage.setText(R.string.title_square);
                    mToolbar.setTitle(R.string.title_square);
                    FoodSquareFragment home=new FoodSquareFragment();
                    manager.beginTransaction().replace(R.id.content,home).commit();
                    return true;
                case R.id.navigation_order:
//                    mTextMessage.setText(R.string.title_order);
                    mToolbar.setTitle(R.string.title_order);
                    OrderCenterFragment orderCenterFragment=new OrderCenterFragment();
                    manager.beginTransaction().replace(R.id.content,orderCenterFragment).commit();
                    return true;
                case R.id.navigation_food:
//                    mTextMessage.setText(R.string.title_food);
                    mToolbar.setTitle(R.string.title_food);
                    MineFoodFragment mineFood=new MineFoodFragment();
                    manager.beginTransaction().replace(R.id.content,mineFood).commit();

                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
