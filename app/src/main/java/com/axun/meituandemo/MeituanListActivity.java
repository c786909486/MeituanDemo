package com.axun.meituandemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MeituanListActivity extends AppCompatActivity {

    private TabLayout mTabLay;
    private ViewPager mViewPager;
    private MyPagerAdapter pagerAdapter;
    private List<String> titles = new ArrayList<>();
    private List<Fragment> views = new ArrayList<>();

    MenuFragment menuFragment;
    Fragment fragment1;
    Fragment fragment2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meituan_list);
        initView();
    }

    private void initView() {
        mTabLay = (TabLayout) findViewById(R.id.tab_lay);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        titles.add("点餐");
        titles.add("评价");
        titles.add("商家");
        menuFragment = new MenuFragment();
        views.add(menuFragment);
        fragment1 = new Fragment();
        fragment2 = new Fragment();
        views.add(fragment1);
        views.add(fragment2);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),views,titles);
        mViewPager.setAdapter(pagerAdapter);
        mTabLay.setupWithViewPager(mViewPager);

    }
}
