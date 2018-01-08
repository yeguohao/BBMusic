package com.yeguohao.bbmusic.discover;

import android.app.Fragment;
import android.os.Bundle;

public class DiscoverFragment extends Fragment {

    public static DiscoverFragment newInstance() {
        Bundle args = new Bundle();
        DiscoverFragment fragment = new DiscoverFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
