package com.androidlab.daggermvpdemo.net;

import com.androidlab.daggermvpdemo.net.gankPicture.GankApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Haodong on 2017/4/5.
 */

public class GankApiService {

    private Retrofit mRetrofit;

    public static final String BASE_URL="http://gank.io/api/random/data/福利/";
    private GankApiService(){


        OkHttpClient.Builder mBuilder=new OkHttpClient.Builder()
                .writeTimeout(5, TimeUnit.SECONDS);

        mRetrofit=new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(mBuilder.build())
                .build();
    }

    public static GankApiService getInstance(){
        return SingleInstance.INSTANVE;
    }
    private static class SingleInstance{
        private static final GankApiService INSTANVE=new GankApiService();
    }
    public GankApi getGankApi(){
        return  mRetrofit.create(GankApi.class);

    }
}
