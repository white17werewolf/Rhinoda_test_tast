package com.rhinoda.marina.rhinoda_test_tast.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.SecondActivityAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.menu)
    BottomNavigationView bottomNavMenu;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_default_page_activity);
        ButterKnife.bind(this);
        SecondActivityAdapter myAdapter = new SecondActivityAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
        bottomNavMenu.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.bottomNavLogin :
                viewPager.setCurrentItem(0);
                break;
            case R.id.bottomNavAvents:
                viewPager.setCurrentItem(1);
                break;
            case R.id.bottomNavProfile:
                viewPager.setCurrentItem(2);
                break;
            case R.id.bottomNavGroups:
                viewPager.setCurrentItem(3);
                break;
        }
        return true;
    }
}





