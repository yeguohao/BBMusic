package com.yeguohao.bbmusic.friends;

import android.app.Fragment;
import android.os.Bundle;

public class FriendsFragment extends Fragment {

    public static FriendsFragment newInstance() {
        Bundle args = new Bundle();
        FriendsFragment fragment = new FriendsFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
