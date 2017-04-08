package com.androidlab.daggermvpdemo.ui.widght;

import android.app.AlertDialog;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.StyleRes;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.androidlab.daggermvpdemo.R;
import com.bumptech.glide.Glide;

/**
 * Created by Haodong on 2017/4/8.
 */

public class BigImageDialog extends AlertDialog {
    private static final String TAG = "BigImageDialog";
    private ImageView mImageView;
    private Context mContext;
    private String mString;


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
}
