package com.androidlab.daggermvpdemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androidlab.daggermvpdemo.R;
import com.androidlab.daggermvpdemo.model.bean.Gank;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haodong on 2017/4/5.
 */

public class GankAdapter extends RecyclerView.Adapter<GankAdapter.ViewHolder> {

    private List<Gank.ResultsBean>mGankList=new ArrayList<>();
    private Context mContext;
    private  OnRecyclerViewItemClickListener mOnRecyclerViewItemClickListener;

    public GankAdapter(List<Gank.ResultsBean> gankList, Context context) {
        mGankList = gankList;
        mContext = context;
    }
    public interface OnRecyclerViewItemClickListener{
        void clickItem(View view,int position);
    }

    public  void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener){
        mOnRecyclerViewItemClickListener=onRecyclerViewItemClickListener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Glide.with(mContext)
                .load(mGankList.get(position).getUrl())
                .override(750, 750)
                .placeholder(R.drawable.ic_face_black_24dp)
                .fitCenter()
                .into(holder.mImageView);
        if (mOnRecyclerViewItemClickListener!=null){
            holder.mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnRecyclerViewItemClickListener.clickItem(holder.itemView,holder.getLayoutPosition());
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return mGankList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
