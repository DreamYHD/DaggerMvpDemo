package com.androidlab.daggermvpdemo.model.net;

import com.androidlab.daggermvpdemo.model.bean.Gank;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Haodong on 2017/4/5.
 */

public interface GankApi {

    @GET("{month}/{day}")
    Observable<Gank>getGank(@Path("month")int month,@Path("day")int day);
}
