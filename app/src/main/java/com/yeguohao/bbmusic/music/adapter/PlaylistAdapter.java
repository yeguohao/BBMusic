package com.yeguohao.bbmusic.music.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yeguohao.bbmusic.R;
import com.yeguohao.bbmusic.music.entities.Creator;
import com.yeguohao.bbmusic.music.entities.Playlist;

public class PlaylistAdapter extends BaseQuickAdapter<Playlist, BaseViewHolder> {

    public PlaylistAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, Playlist item) {
        helper.setText(R.id.play_list_name, item.getName());
        Creator creator = item.getCreator();
        if (creator.getUserId() == item.getUserId()) {
            helper.setText(R.id.track_count, item.getTrackCount() + "首");
        } else {
            helper.setText(R.id.track_count, item.getTrackCount() + "首 by " + creator.getNickname());
        }
        ImageView img = helper.getView(R.id.play_list_cover);
        Glide.with(img.getContext()).load(item.getCoverImgUrl()).into(img);
    }
}
