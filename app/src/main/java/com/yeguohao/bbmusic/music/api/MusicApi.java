package com.yeguohao.bbmusic.music.api;

import com.yeguohao.bbmusic.music.entities.Data;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusicApi {

    @GET("user/playlist")
    Observable<Data> playList(@Query("uid") int uid);

}
