package com.yeguohao.bbmusic.music;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yeguohao.bbmusic.R;
import com.yeguohao.bbmusic.base.BaseFragment;
import com.yeguohao.bbmusic.base.RetrofitInstance;
import com.yeguohao.bbmusic.music.adapter.PlaylistAdapter;
import com.yeguohao.bbmusic.music.api.MusicApi;
import com.yeguohao.bbmusic.music.entities.Playlist;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MusicFragment extends BaseFragment {

    private int userId = 98052967;

    @BindView(R.id.create_recycler) RecyclerView createRecycler;
    @BindView(R.id.favorite_recycler) RecyclerView favoriteRecycler;

    private MusicApi musicApi = RetrofitInstance.instance().create(MusicApi.class);

    private BaseQuickAdapter<Playlist, BaseViewHolder> createAdapter, favoriteAdapter;

    @Override
    protected void initView(View root) {
        createAdapter = new PlaylistAdapter(R.layout.item_playlist);
        favoriteAdapter = new PlaylistAdapter(R.layout.item_playlist);
        createRecycler.setAdapter(createAdapter);
        favoriteRecycler.setAdapter(favoriteAdapter);
    }

    @Override
    protected int layout() {
        return R.layout.fragment_music;
    }

    @Override
    protected void fetch() {
        musicApi.playList(userId)
                .filter(data -> data.getCode() == 200)
                .subscribe(data -> {
                    List<Playlist> createPlaylist = new ArrayList<>();
                    List<Playlist> favoritePlaylist = new ArrayList<>();
                    for (Playlist playlist : data.getPlaylist()) {
                        if (userId == playlist.getUserId()) createPlaylist.add(playlist);
                        else favoritePlaylist.add(playlist);
                    }
                    getActivity().runOnUiThread(() -> {
                        createAdapter.addData(createPlaylist);
                        favoriteAdapter.addData(favoritePlaylist);
                    });
                });
    }

    public static MusicFragment newInstance() {
        Bundle args = new Bundle();
        MusicFragment fragment = new MusicFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
