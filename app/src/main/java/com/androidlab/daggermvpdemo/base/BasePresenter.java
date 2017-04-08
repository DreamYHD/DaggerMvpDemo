package com.androidlab.daggermvpdemo.base;

import android.util.Log;
import android.view.View;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Haodong on 2017/3/22.
 */

public interface   BasePresenter{


    public void addSubscribe(Subscription subscription);

    public void  unSubscribe();


}
