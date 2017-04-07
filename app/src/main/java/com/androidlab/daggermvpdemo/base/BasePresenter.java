package com.androidlab.daggermvpdemo.base;

import android.util.Log;
import android.view.View;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Haodong on 2017/3/22.
 */

public class BasePresenter<V extends BaseView,M extends BaseModel> {
    private static final String TAG = "BasePresenter";

    private V mView;
    private M mModel;

    //manage rx life
    private CompositeSubscription mSubscription;

    public void addSubscribe(Subscription subscription){
        if (mSubscription==null){
            mSubscription=new CompositeSubscription();
        }
        mSubscription.add(subscription);
    }
    public void  unSubscribe(){
        if (mView!=null){
            mView=null;
            Log.e(TAG, "unSubscribe: view null" );
        }
        if (mSubscription!=null&&mSubscription.hasSubscriptions()){
            mSubscription.clear();
        }



    }

}
