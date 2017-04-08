package com.androidlab.daggermvpdemo.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.contract.GankContract;
import com.androidlab.daggermvpdemo.model.bean.Gank;
import com.androidlab.daggermvpdemo.ui.adapter.GankAdapter;
import com.androidlab.daggermvpdemo.ui.widght.BigImageDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haodong on 2017/3/22.
 */

public class GankFragment extends Fragment implements GankContract.View {
    private GankContract.Presenter mPresenter;
    private RecyclerView mRecyclerView;
    private GankAdapter mGankAdapter;
    private List<Gank.ResultsBean>mGankList;

    public static GankFragment getInstance(){
        return new GankFragment();
    }

    @Override
    public void setPresenter(GankContract.Presenter Presenter) {
        this.mPresenter=Presenter;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGankList=new ArrayList<>();

    }

    @Override
    public void onResume() {
        super.onResume();
         mPresenter.getGank();


    }

    @Override
    public void onPause() {
        super.onPause();
        if (mPresenter!=null){

            mPresenter.unSubscribe();
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_dagger,container,false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mGankAdapter=new GankAdapter(mGankList,getContext());
        mRecyclerView.setAdapter(mGankAdapter);
        mGankAdapter.setOnRecyclerViewItemClickListener(new GankAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void clickItem(View view, int position) {
               showBigImage(mGankList.get(position).getUrl());
            }
        });
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (!ViewCompat.canScrollVertically(recyclerView, 1)) {
                    mPresenter.getGank();
                }
            }
        });
        return view;
    }


    @Override
    public void showGank(Gank mGank) {
        mGankList.addAll(mGank.getResults());
        mGankAdapter.notifyDataSetChanged();
    }

    @Override
    public void showBigImage(String url) {
        BigImageDialog bigImageDialog=new BigImageDialog(getContext(),R.style.Dialog,url);
        bigImageDialog.show();
    }
}
