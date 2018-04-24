package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabs = {"colors", "family", "numbers", "phrases"};

    MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ColorsFragment();
        }else if (position == 1){
            return new FamilyFragment();
        }else if (position == 2){
            return new NumbersFragment();
        }else
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position].toUpperCase();
    }
}
