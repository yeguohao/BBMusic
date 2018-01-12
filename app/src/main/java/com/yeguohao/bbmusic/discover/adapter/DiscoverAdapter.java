package com.yeguohao.bbmusic.discover.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.yeguohao.bbmusic.discover.music.DiscoverMusicFragment;
import com.yeguohao.bbmusic.discover.radio.RadioFragment;
import com.yeguohao.bbmusic.discover.video.VideoFragment;

public class DiscoverAdapter extends FragmentPagerAdapter {

    public DiscoverAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return DiscoverMusicFragment.newInstance();
        if (position == 1) return VideoFragment.newInstance();
        return RadioFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
