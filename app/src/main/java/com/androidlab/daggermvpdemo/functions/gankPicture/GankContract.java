package com.androidlab.daggermvpdemo.functions.gankPicture;

import com.androidlab.daggermvpdemo.base.BaseModel;
import com.androidlab.daggermvpdemo.base.BasePresenter;
import com.androidlab.daggermvpdemo.base.BaseView;
import com.androidlab.daggermvpdemo.bean.GankPictureBean;

import rx.Observable;

/**
 * Created by Haodong on 2017/3/22.
 */

public interface GankContract {

    interface View extends BaseView{

        void showGank(GankPictureBean mGank);

        void showBigImage(String url);

    }
    interface Model extends BaseModel{
        Observable <GankPictureBean>getGank( );
    }
    abstract class Presenter extends BasePresenter<View,Model>{
        public abstract void getGank();

    }
}
