package com.yeguohao.bbmusic.discover.radio;

import android.os.Bundle;

import com.yeguohao.bbmusic.base.BaseFragment;

public class RadioFragment extends BaseFragment {

    @Override
    protected int layout() {
        return 0;
    }

    public static RadioFragment newInstance() {
        Bundle args = new Bundle();
        RadioFragment fragment = new RadioFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
