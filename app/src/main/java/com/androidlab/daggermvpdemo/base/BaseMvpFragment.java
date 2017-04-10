package com.androidlab.daggermvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Haodong on 2017/4/10.
 */

public abstract class BaseMvpFragment<P extends BasePresenter,M extends BaseModel>extends Fragment implements BaseView {

    protected P mPresenter;

    private M mModel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(getLayoutId(),container,false);
        initChildView(view,savedInstanceState );
        fragmentLogic();
        return view;
    }

    //逻辑处理
    protected abstract void fragmentLogic();

    //初始化View
    protected abstract void initChildView(View mView,Bundle b);

    //获取布局
    protected abstract int getLayoutId();


    @Override
    public void onResume() {
        super.onResume();
        if (mPresenter == null) {
            mPresenter.attach(this,mModel);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.deatch();
        }
    }
}
