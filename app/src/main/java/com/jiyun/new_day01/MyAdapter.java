package com.jiyun.new_day01;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Brother Chen on 2017/12/19.
 */

class MyAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragments;
        private List<String> strings;
        private FragmentManager supportFragmentManager;

    public MyAdapter(List<Fragment> fragments, List<String> strings, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
        this.fragments=fragments;
        this.strings=strings;

    }

    @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return strings.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return strings.get(position);
        }
}
