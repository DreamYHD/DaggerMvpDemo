package com.androidlab.daggermvpdemo.contract;

import com.androidlab.daggermvpdemo.base.BaseModel;
import com.androidlab.daggermvpdemo.base.BasePresenter;
import com.androidlab.daggermvpdemo.base.BaseView;
import com.androidlab.daggermvpdemo.model.bean.Gank;

import rx.Observable;

/**
 * Created by Haodong on 2017/3/22.
 */

public interface GankContract {

    interface View extends BaseView<Presenter>{

        void showText();

    }
    interface Model extends BaseModel{
        Observable <Gank>getGank();
    }
    abstract class Presenter extends BasePresenter<BaseView,BaseModel>{
        abstract void getGank();
    }
}