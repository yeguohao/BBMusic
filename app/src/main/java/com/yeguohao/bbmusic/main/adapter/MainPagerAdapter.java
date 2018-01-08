package com.yeguohao.bbmusic.main.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.yeguohao.bbmusic.discover.DiscoverFragment;
import com.yeguohao.bbmusic.friends.FriendsFragment;
import com.yeguohao.bbmusic.music.MusicFragment;

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return MusicFragment.newInstance();
        if (position == 1) return DiscoverFragment.newInstance();
        return FriendsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
