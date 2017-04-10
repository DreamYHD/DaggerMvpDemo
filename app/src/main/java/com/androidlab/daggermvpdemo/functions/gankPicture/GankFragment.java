package com.androidlab.daggermvpdemo.functions.gankPicture;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;


import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.base.BaseMvpFragment;
import com.androidlab.daggermvpdemo.bean.GankPictureBean;
import com.androidlab.daggermvpdemo.widght.BigImageDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haodong on 2017/3/22.
 */

public class GankFragment extends BaseMvpFragment<GankPresenter,GankModel> implements GankContract.View {
    private RecyclerView mRecyclerView;
    private GankAdapter mGankAdapter;
    private List<GankPictureBean.ResultsBean>mGankList;

    public static GankFragment getInstance(){
        return new GankFragment();
    }

    @Override
    protected void fragmentLogic() {
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

    }
    @Override
    protected void initChildView(View mView, Bundle b) {
        mGankList=new ArrayList<>();
        mRecyclerView= (RecyclerView) mView.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mGankAdapter=new GankAdapter(mGankList,getContext());
        mRecyclerView.setAdapter(mGankAdapter);

    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_dagger;
    }

    @Override
    public void showGank(GankPictureBean mGank) {
        mGankList.addAll(mGank.getResults());
        mGankAdapter.notifyDataSetChanged();
    }
    @Override
    public void showBigImage(String url) {
        BigImageDialog bigImageDialog=new BigImageDialog(getContext(),R.style.Dialog,url);
        bigImageDialog.show();
    }
}
