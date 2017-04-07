package com.androidlab.daggermvpdemo.utils.schedulers;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Haodong on 2017/4/5.
 */

public class SchedulerProvider implements BaseScheduleProvider {

    private static final String TAG = "SchedulerProvider";

    //single
    private SchedulerProvider(){

    }

    public static SchedulerProvider getInstance(){
        return  SingleHolder.instance;
    }

    private static class SingleHolder{

        private static final SchedulerProvider instance=new SchedulerProvider();
    }


    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
