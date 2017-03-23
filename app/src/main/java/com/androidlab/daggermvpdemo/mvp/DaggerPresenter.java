package com.androidlab.daggermvpdemo.mvp;

import android.media.tv.TvContentRating;

import javax.inject.Inject;

import dagger.Module;

/**
 * Created by Haodong on 2017/3/22.
 */
public class DaggerPresenter implements DaggerContract.Presenter {

    private DaggerContract.View mView;
    private String mId;



    @Inject
    public DaggerPresenter(DaggerContract.View mView,String mId) {

        this.mView=mView;
        this.mId=mId;

    }

    @Override
    public void start() {
        mView.showText();

    }
}
