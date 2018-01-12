package com.yeguohao.bbmusic.discover;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import com.yeguohao.bbmusic.R;
import com.yeguohao.bbmusic.base.BaseFragment;
import com.yeguohao.bbmusic.discover.adapter.DiscoverAdapter;

import java.lang.reflect.Field;

import butterknife.BindView;

public class DiscoverFragment extends BaseFragment {

    @BindView(R.id.tab_layout) TabLayout tabLayout;
    @BindView(R.id.viewpager) ViewPager viewpager;

    @Override
    protected int layout() {
        return R.layout.fragment_discover;
    }

    @Override
    protected void initView(View root) {
        root.post(this::adjustTabLayoutChildWidthWithMargin);
        viewpager.setAdapter(new DiscoverAdapter(getChildFragmentManager()));
    }

    private void adjustTabLayoutChildWidthWithMargin() {
        Class<?> aClass = tabLayout.getClass();
        Field tabStrip = null;
        try {
            tabStrip = aClass.getDeclaredField("mTabStrip");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        assert tabStrip != null;
        tabStrip.setAccessible(true);
        LinearLayout ll_tab= null;
        try {
            ll_tab = (LinearLayout) tabStrip.get(tabLayout);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assert ll_tab != null;
        for (int i = 0; i < ll_tab.getChildCount(); i++) {
            View child = ll_tab.getChildAt(i);
            child.setPadding(0,0,0,0);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT,1);
            params.setMarginStart(50);
            params.setMarginEnd(50);
            child.setLayoutParams(params);
            child.invalidate();
        }
    }

    public static DiscoverFragment newInstance() {
        Bundle args = new Bundle();
        DiscoverFragment fragment = new DiscoverFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
