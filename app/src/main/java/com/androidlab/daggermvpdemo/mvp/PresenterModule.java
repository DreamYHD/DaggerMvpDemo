package com.androidlab.daggermvpdemo.mvp;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Haodong on 2017/3/22.
 */

@Module
public class PresenterModule {

    private final DaggerContract.View mView;

    private final String mId;

    public PresenterModule(DaggerContract.View view, String id) {
        mView = view;
        mId = id;
    }

    @Provides
    DaggerContract.View getView(){
        return mView;

    }
    @Provides
    String getId(){

        return mId;
    }


}
