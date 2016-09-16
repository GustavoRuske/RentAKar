package com.example.gustavo.rentakar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Gustavo on 14/09/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public PagerAdapter(FragmentManager fn, List<Fragment> fragments){
        super(fn);

        this.fragments = fragments;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position){
        return fragments.get(position);
    }

    @Override
    public int getCount(){
        return  fragments.size();
    }
}
