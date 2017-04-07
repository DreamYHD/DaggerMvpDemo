package com.androidlab.daggermvpdemo.dagger;

import com.androidlab.daggermvpdemo.contract.GankContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Haodong on 2017/3/22.
 */

@Module
public class GankPresenterModule {

    private final GankContract.View mView;

    private final String mId;

    public GankPresenterModule(GankContract.View view, String id) {
        mView = view;
        mId = id;
    }

    @Provides
    GankContract.View getView(){
        return mView;

    }
    @Provides
    String getId(){
        return mId;
    }


}
