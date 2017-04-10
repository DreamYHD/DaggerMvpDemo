package com.androidlab.daggermvpdemo.functions.gankPicture;

import com.androidlab.daggermvpdemo.bean.GankPictureBean;
import com.androidlab.daggermvpdemo.net.GankApiService;
import com.androidlab.daggermvpdemo.utils.schedulers.SchedulerProvider;

import rx.Observable;

/**
 * Created by Haodong on 2017/4/5.
 */

public class GankModel implements GankContract.Model {
    @Override
    public Observable<GankPictureBean> getGank() {
        return  GankApiService.getInstance()
                .getGankApi()
                .getGank(20)
                .subscribeOn(SchedulerProvider.getInstance().io())
                .unsubscribeOn(SchedulerProvider.getInstance().io())
                .observeOn(SchedulerProvider.getInstance().ui());
    }
}
