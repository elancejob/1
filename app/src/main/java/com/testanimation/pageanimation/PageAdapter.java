package com.testanimation.pageanimation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ammar on 2/8/15.
 */
public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        PageFragment pageFragment = new PageFragment();
        pageFragment.setId("ID: " + i);
        return pageFragment;
    }

    @Override
    public int getCount() {
        return 100;
    }
}
