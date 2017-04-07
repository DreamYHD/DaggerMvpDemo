package com.androidlab.daggermvpdemo.model.modelimp;

import com.androidlab.daggermvpdemo.contract.GankContract;
import com.androidlab.daggermvpdemo.model.bean.Gank;
import com.androidlab.daggermvpdemo.model.net.GankApiService;
import com.androidlab.daggermvpdemo.utils.schedulers.BaseScheduleProvider;
import com.androidlab.daggermvpdemo.utils.schedulers.SchedulerProvider;

import rx.Observable;

/**
 * Created by Haodong on 2017/4/5.
 */

public class GankModel implements GankContract.Model {
    @Override
    public Observable<Gank> getGank() {
        return  GankApiService.getInstance()
                .getGankApi()
                .getGank(20)
                .subscribeOn(SchedulerProvider.getInstance().io())
                .unsubscribeOn(SchedulerProvider.getInstance().io())
                .observeOn(SchedulerProvider.getInstance().ui());
    }
}
