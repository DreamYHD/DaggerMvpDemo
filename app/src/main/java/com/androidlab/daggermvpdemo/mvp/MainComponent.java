package com.androidlab.daggermvpdemo.mvp;

import com.androidlab.daggermvpdemo.MainActivity;

import dagger.Component;

/**
 * Created by Haodong on 2017/3/22.
 */

@Component(modules = PresenterModule.class)
public interface MainComponent {
    void inject(DaggerActivity activity);


}
