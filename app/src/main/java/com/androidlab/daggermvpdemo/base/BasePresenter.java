package com.androidlab.daggermvpdemo.base;

import android.util.Log;
import android.view.View;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Haodong on 2017/3/22.
 */

public abstract class BasePresenter<V extends BaseView ,M extends BaseModel>{
    private static final String TAG = "BasePresenter";

    protected  V mView;
    protected  M mModel;
    private CompositeSubscription mSubscription;



    protected void attach(V mView,M mModel){
        if (this.mView==null){
            this.mView=mView;
        }
        if (this.mModel==null){
            this.mModel=mModel;
        }
    }

    protected void addSubscribe(Subscription subscription) {
        if (mSubscription == null) {
            mSubscription = new CompositeSubscription();
        }
        mSubscription.add(subscription);
    }

    protected void deatch() {
        if (mView!=null){
            mView=null;
            Log.e(TAG, "unSubscribe: view null" );
        }
        if (mSubscription != null && mSubscription.hasSubscriptions()) {
            mSubscription.clear();
            Log.e(TAG, "unSubscribe: mSubscription null");
        }


    }


}
