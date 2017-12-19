package com.jiyun.new_day01;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {


    @Bind(R.id.vp_007)
    ViewPager vp007;
    @Bind(R.id.tl_007)
    TabLayout tl007;
    private List<String> strings;
    private List<Fragment> fragments;
    private NewsFragment newsFragment;
    private BFragment bFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        strings = new ArrayList<>();
        strings.add("新闻");
        strings.add("B页面");
        fragments = new ArrayList<>();
        newsFragment = new NewsFragment();
        bFragment = new BFragment();
        fragments.add(newsFragment);
        fragments.add(bFragment);
        MyAdapter myAdapter = new MyAdapter(fragments,strings,getSupportFragmentManager());
        vp007.setAdapter(myAdapter);
        tl007.setupWithViewPager(vp007);

    }
}
