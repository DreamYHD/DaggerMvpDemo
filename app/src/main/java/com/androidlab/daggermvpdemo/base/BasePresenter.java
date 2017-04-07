package com.androidlab.daggermvpdemo.base;

import android.view.View;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Haodong on 2017/3/22.
 */

public class BasePresenter<V extends BaseView,M extends BaseModel> {

    private V mView;
    private M mModel;

    //manage rx life
    private CompositeSubscription mSubscription;

    protected void addSubscribe(Subscription subscription){
        if (mSubscription==null){
            mSubscription=new CompositeSubscription();
        }
        mSubscription.add(subscription);
    }
    protected void  unSubscribe(){
        if (mView!=null){
            mView=null;
        }
        if (mSubscription!=null&&mSubscription.hasSubscriptions()){
            mSubscription.clear();
        }



    }

}
