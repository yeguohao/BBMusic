package com.yeguohao.bbmusic.discover.music.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.util.MultiTypeDelegate;

import java.util.List;

public class DiscoverMusicAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {

    public DiscoverMusicAdapter() {
        super(null);
        setMultiTypeDelegate(new MultiTypeDelegate<Object>() {
            @Override
            protected int getItemType(Object o) {
                return 0;
            }
        });
        getMultiTypeDelegate().registerItemType()
    }

    @Override
    protected void convert(BaseViewHolder helper, Object item) {

    }
}
