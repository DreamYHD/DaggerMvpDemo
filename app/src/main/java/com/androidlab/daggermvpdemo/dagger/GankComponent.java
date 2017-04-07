package com.androidlab.daggermvpdemo.dagger;

import android.app.Activity;


import com.androidlab.daggermvpdemo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Haodong on 2017/3/22.
 */

@Component(modules = GankPresenterModule.class)
public interface GankComponent {
    void inject(MainActivity activity);
}
