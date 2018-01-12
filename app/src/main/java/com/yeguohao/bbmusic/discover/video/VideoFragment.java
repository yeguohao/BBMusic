package com.yeguohao.bbmusic.discover.video;

import android.os.Bundle;

import com.yeguohao.bbmusic.base.BaseFragment;

public class VideoFragment extends BaseFragment {

    @Override
    protected int layout() {
        return 0;
    }

    public static VideoFragment newInstance() {
        Bundle args = new Bundle();
        VideoFragment fragment = new VideoFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
