package com.androidlab.daggermvpdemo.model.net;

import com.androidlab.daggermvpdemo.model.bean.Gank;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Haodong on 2017/4/5.
 */

public interface GankApi {

    @GET("{num}")
    Observable<Gank>getGank(@Path("num")int num);
}
