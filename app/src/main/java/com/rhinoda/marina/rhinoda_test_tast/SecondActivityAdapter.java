package com.rhinoda.marina.rhinoda_test_tast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rhinoda.marina.rhinoda_test_tast.fragment.AventFragment;
import com.rhinoda.marina.rhinoda_test_tast.fragment.LoginFragment;
import com.rhinoda.marina.rhinoda_test_tast.fragment.ProfileFragment;

public class SecondActivityAdapter extends FragmentPagerAdapter {
    SecondActivityAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new LoginFragment();
            case 1: return new AventFragment();
            case 2: return new ProfileFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
