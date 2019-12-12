package com.rhinoda.marina.rhinoda_test_tast;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rhinoda.marina.rhinoda_test_tast.fragment.AventFragment;

import java.util.List;

public class SecondActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavMenu;
    FrameLayout frameLayout;
    ViewPager viewPager;
    RecyclerView recyclerView;
    List<AventFragment> listItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_default_page_activity);
        bottomNavMenu = findViewById(R.id.menu);
        viewPager = findViewById(R.id.viewPager);
        frameLayout = findViewById(R.id.frame);

        //recyclerView = findViewById(R.id.recyclerView);
        initRecyclerView();

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
        }
        //getSupportFragmentManager().beginTransaction().replace(R.id.viewPager, selectedFragment).commit();
        return true;
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}





