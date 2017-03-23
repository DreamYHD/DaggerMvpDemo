package com.androidlab.daggermvpdemo.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.androidlab.daggermvpdemo.R;

/**
 * Created by Haodong on 2017/3/22.
 */

public class DaggerFragment  extends Fragment implements DaggerContract.View {
    private DaggerContract.Presenter mPresenter;

    private TextView mTextView;

    @Override
    public void setPresenter(DaggerContract.Presenter Presenter) {

        this.mPresenter=Presenter;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_dagger,container,false);
        mTextView= (TextView) view.findViewById(R.id.text_show);
        return view;
    }

    @Override
    public void showText() {
        mTextView.setText("helloworld"+"..");
        Log.e("TGA","helloworld");
        Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();

    }
}
