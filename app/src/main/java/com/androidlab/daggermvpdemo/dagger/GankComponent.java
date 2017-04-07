package com.androidlab.daggermvpdemo.dagger;

import com.androidlab.daggermvpdemo.ui.activity.GankActivity;

import dagger.Component;

/**
 * Created by Haodong on 2017/3/22.
 */

@Component(modules = GankPresenterModule.class)
public interface GankComponent {
    void inject(GankActivity activity);
}
