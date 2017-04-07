package com.androidlab.daggermvpdemo;

import android.app.Application;
import android.content.Context;

import com.androidlab.daggermvpdemo.model.net.GankApiService;

/**
 * Created by Haodong on 2017/4/7.
 */

public class App extends Application {
    public   static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
        GankApiService.getInstance();


    }
    public static Context getContext(){
        return mContext;
    }
}
