package com.skplanet.study.testapplication;

/**
 * Created by 1002216 on 2017. 8. 14..
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.skplanet.study.commonui.GridFragment;
import com.skplanet.study.networktest.retrofit.RetrofitTestFragment;
import com.skplanet.study.testapplication.fragment.PlaceholderFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPagerAdapter";

    private static final int PAGE_ID_RETROFIT = 0;
    private static final int PAGE_ID_GRID = 1;


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch(position) {
            case PAGE_ID_RETROFIT:
                return RetrofitTestFragment.newInstance(null);
            case PAGE_ID_GRID:
                return GridFragment.newInstance(null);
            default:
                return PlaceholderFragment.newInstance(position + 1);
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case PAGE_ID_RETROFIT:
                return RetrofitTestFragment.getName();
            case PAGE_ID_GRID:
                return GridFragment.getName();
            default:
                return "SECTION " + position;
        }
    }
}