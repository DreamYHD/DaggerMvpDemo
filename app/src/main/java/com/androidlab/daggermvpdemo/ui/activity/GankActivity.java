package com.androidlab.daggermvpdemo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.mvp.DaggerMainComponent;
import com.androidlab.daggermvpdemo.dagger.GankPresenter;
import com.androidlab.daggermvpdemo.dagger.GankPresenterModule;
import com.androidlab.daggermvpdemo.ui.fragment.DaggerFragment;
import com.androidlab.daggermvpdemo.utils.ActivityUtils;

import javax.inject.Inject;

public class GankActivity extends AppCompatActivity {

    @Inject
    GankPresenter mDaggerPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        DaggerFragment addEditTaskFragment=new DaggerFragment();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                addEditTaskFragment,R.id.frame_all);
        DaggerMainComponent.builder()
                .presenterModule(new GankPresenterModule(addEditTaskFragment,"ID"))
                .build()
                .inject(this);



    }
}
