package com.yeguohao.bbmusic.music;

import android.os.Bundle;

import com.yeguohao.bbmusic.R;
import com.yeguohao.bbmusic.base.BaseFragment;

public class MusicFragment extends BaseFragment {

    @Override
    protected int layout() {
        return R.layout.fragment_music;
    }

    public static MusicFragment newInstance() {
        Bundle args = new Bundle();
        MusicFragment fragment = new MusicFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
