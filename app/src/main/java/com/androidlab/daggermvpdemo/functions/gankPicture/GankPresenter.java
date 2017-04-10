package com.androidlab.daggermvpdemo.functions.gankPicture;


import android.util.Log;

import com.androidlab.daggermvpdemo.bean.GankPictureBean;

import rx.Observer;
import rx.Subscription;


/**
 * Created by Haodong on 2017/3/22.
 */
public  class GankPresenter extends GankContract.Presenter {
    private static final String TAG = "GankPresenter";
    @Override
    public void getGank() {
        Subscription subscription = mModel.getGank()
                .subscribe(new Observer<GankPictureBean>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted: success " );
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError: something wrong");

                    }

                    @Override
                    public void onNext(GankPictureBean gank) {
                        mView.showGank(gank);
                    }
                });
        addSubscribe(subscription);

    }


}
