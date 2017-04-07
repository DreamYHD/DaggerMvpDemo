package com.androidlab.daggermvpdemo.utils.schedulers;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by Haodong on 2017/4/5.
 */

public interface BaseScheduleProvider {

    //the scheduler using for computer
    Scheduler computation();

    //the scheduler using for io
    Scheduler  io();

    //the scheduler using for ui
    Scheduler  ui();

}
