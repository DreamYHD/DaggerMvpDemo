package com.androidlab.daggermvpdemo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.dagger.DaggerGankComponent;
import com.androidlab.daggermvpdemo.dagger.GankPresenter;
import com.androidlab.daggermvpdemo.dagger.GankPresenterModule;
import com.androidlab.daggermvpdemo.ui.fragment.GankFragment;
import com.androidlab.daggermvpdemo.utils.ActivityUtils;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    GankPresenter mDaggerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GankFragment gankFragment=GankFragment.getInstance();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                gankFragment,R.id.repalce);
        DaggerGankComponent.builder()
                .gankPresenterModule(new GankPresenterModule(gankFragment,"1"))
                .build()
                .inject(this);

    }
}
