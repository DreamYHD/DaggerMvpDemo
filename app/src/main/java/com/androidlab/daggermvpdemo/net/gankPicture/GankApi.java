package com.androidlab.daggermvpdemo.net.gankPicture;

import com.androidlab.daggermvpdemo.bean.GankPictureBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Haodong on 2017/4/5.
 */

public interface GankApi {

    @GET("{num}")
    Observable<GankPictureBean>getGank(@Path("num")int num);
}
