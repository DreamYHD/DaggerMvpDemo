package com.androidlab.daggermvpdemo.mvp;

import com.androidlab.daggermvpdemo.BasePresenter;
import com.androidlab.daggermvpdemo.BaseView;

/**
 * Created by Haodong on 2017/3/22.
 */

public interface DaggerContract {

    interface View extends BaseView<Presenter>{

        void showText();

    }
    interface Presenter extends BasePresenter{

    }
}
