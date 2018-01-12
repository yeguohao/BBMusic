package com.yeguohao.bbmusic.discover.music;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yeguohao.bbmusic.R;
import com.yeguohao.bbmusic.base.BaseFragment;

import butterknife.BindView;

public class DiscoverMusicFragment extends BaseFragment {

    @BindView(R.id.discover_music_recycler) RecyclerView recycler;

    private BaseQuickAdapter<Object, BaseViewHolder> adapter;

    @Override
    protected int layout() {
        return R.layout.fragment_discover_music;
    }

    @Override
    protected void initView(View root) {

    }

    public static DiscoverMusicFragment newInstance() {
        Bundle args = new Bundle();
        DiscoverMusicFragment fragment = new DiscoverMusicFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
