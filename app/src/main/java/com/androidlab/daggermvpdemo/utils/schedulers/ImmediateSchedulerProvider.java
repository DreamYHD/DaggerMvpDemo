package com.androidlab.daggermvpdemo.utils.schedulers;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by Haodong on 2017/4/5.
 */

/**
 *using for immediate scheduler just for
 */
public class ImmediateSchedulerProvider implements BaseScheduleProvider {
    private static final String TAG = "ImmediateSchedulerProvi";

    @Override
    public Scheduler computation() {
        return Schedulers.immediate();
    }

    @Override
    public Scheduler io() {
        return Schedulers.immediate();
    }

    @Override
    public Scheduler ui() {
        return Schedulers.immediate();
    }
}
