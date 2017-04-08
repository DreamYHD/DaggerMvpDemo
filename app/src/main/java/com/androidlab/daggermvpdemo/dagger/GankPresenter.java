package com.androidlab.daggermvpdemo.dagger;


import android.util.Log;

import com.androidlab.daggermvpdemo.contract.GankContract;
import com.androidlab.daggermvpdemo.model.bean.Gank;
import com.androidlab.daggermvpdemo.model.modelimp.GankModel;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;


/**
 * Created by Haodong on 2017/3/22.
 */
public  class GankPresenter extends GankContract.Presenter {
    private static final String TAG = "GankPresenter";

    private GankContract.View mView;
    private String mId;
    private GankContract.Model mModel;

    @Inject
    public GankPresenter(GankContract.View mView, String mId) {
        this.mView = mView;
        this.mId = mId;
        mModel = new GankModel();

    }

    @Inject
    void setupListeners() {
        mView.setPresenter(this);
    }


    @Override
    public void getGank() {
        Subscription subscription = mModel.getGank()
                .subscribe(new Observer<Gank>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted: success " + mId);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Gank gank) {
                        mView.showGank(gank);
                    }
                });
        addSubscribe(subscription);

    }
    //管理Rx生命周期防止内存泄漏

    private CompositeSubscription mSubscription;

    public void addSubscribe(Subscription subscription) {
        if (mSubscription == null) {
            mSubscription = new CompositeSubscription();
        }
        mSubscription.add(subscription);
    }

    public void unSubscribe() {
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
