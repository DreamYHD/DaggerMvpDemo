package com.androidlab.daggermvpdemo.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidlab.daggermvpdemo.MainActivity;
import com.androidlab.daggermvpdemo.R;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    DaggerPresenter mDaggerPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        DaggerMainComponent.builder()
                .presenterModule(new PresenterModule(new DaggerFragment(),"ID"))
                .build()
                .inject(this);








    }
}
