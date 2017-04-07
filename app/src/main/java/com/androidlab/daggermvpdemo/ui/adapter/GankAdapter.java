package com.androidlab.daggermvpdemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.androidlab.daggermvpdemo.model.bean.Gank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haodong on 2017/4/5.
 */

public class GankAdapter extends RecyclerView.Adapter<GankAdapter.ViewHolder> {

    private List<Gank>mGankList=new ArrayList<>();
    private Context mContext;

    public GankAdapter(List<Gank> gankList, Context context) {
        mGankList = gankList;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mGankList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
