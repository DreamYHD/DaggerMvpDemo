package com.androidlab.daggermvpdemo;

/**
 * Created by Haodong on 2017/3/22.
 */

public interface BaseView<T>{
    void setPresenter(T Presenter);
}
