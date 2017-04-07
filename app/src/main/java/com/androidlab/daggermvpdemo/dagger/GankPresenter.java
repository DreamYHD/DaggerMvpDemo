package com.androidlab.daggermvpdemo.dagger;


import com.androidlab.daggermvpdemo.contract.GankContract;

import javax.inject.Inject;


/**
 * Created by Haodong on 2017/3/22.
 */
public abstract class GankPresenter extends GankContract.Presenter {

    private GankContract.View mView;
    private String mId;

    @Inject
    public GankPresenter(GankContract.View mView, String mId) {

        this.mView=mView;
        this.mId=mId;
        mView.setPresenter(this);

    }




    @Override
    public void unSubscribe() {

    }
}
