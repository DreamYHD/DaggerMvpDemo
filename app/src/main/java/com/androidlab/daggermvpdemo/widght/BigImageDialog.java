package com.androidlab.daggermvpdemo.widght;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.androidlab.daggermvpdemo.R;
import com.bumptech.glide.Glide;
import com.nineoldandroids.view.ViewHelper;

/**
 * Created by Haodong on 2017/4/8.
 */

public class BigImageDialog extends AlertDialog  {
    private static final String TAG = "BigImageDialog";
    private ImageView mImageView;
    private Context mContext;
    private String mString;
    private GestureDetector mGestureDetector;
    private int mLastX;
    private int mLastY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(mContext, R.layout.big_image,null);
        setContentView(view);
        mImageView= (ImageView) view.findViewById(R.id.image_big);
        Log.e(TAG, "onCreate: "+mString.toString() );

        Glide.with(mContext)
                .load(mString)
                .placeholder(R.drawable.ic_mood_bad_black_24dp)
                .override(1400,1400)
                .into(mImageView);

    }

    protected BigImageDialog(Context context) {
        super(context);

    }

    protected BigImageDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public BigImageDialog(Context context, @StyleRes int themeResId,String imageView) {
        super(context, themeResId);
        this.mContext=context;
        mString = imageView;
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
       int x= (int) event.getRawX();
        int y= (int) event.getRawY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:{
                int deltaX=x-mLastX;
                int deltaY=y-mLastY;
                int translationX= (int) (ViewHelper.getTranslationX(this.mImageView)+deltaX);
                int translationY= (int) (ViewHelper.getTranslationX(this.mImageView)+deltaY);
                ViewHelper.setTranslationX(this.mImageView,translationX);
                ViewHelper.setTranslationY(this.mImageView,translationY);

            }break;
            case  MotionEvent.ACTION_UP:
                ViewHelper.setTranslationX(this.mImageView,0);
                ViewHelper.setTranslationY(this.mImageView,0);
                break;
            default:
        }

        mLastX=x;
        mLastY=y;

        return true;
    }


}
