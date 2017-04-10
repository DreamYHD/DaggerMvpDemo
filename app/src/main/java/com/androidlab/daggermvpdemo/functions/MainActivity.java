package com.androidlab.daggermvpdemo.functions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.functions.gankPicture.GankFragment;
import com.androidlab.daggermvpdemo.utils.ActivityUtils;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GankFragment gankFragment=GankFragment.getInstance();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                gankFragment,R.id.repalce);

    }
}
