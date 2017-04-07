package com.androidlab.daggermvpdemo.model.net;

import com.androidlab.daggermvpdemo.model.bean.Gank;

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
    private GankApi mGankApi;

    public static final String BASE_URL="http://gank.io/api/data/%E7%A6%8F%E5%88%A9/";
    private GankApiService(){


        OkHttpClient.Builder mBuilder=new OkHttpClient.Builder()
                .writeTimeout(5, TimeUnit.SECONDS);

        mRetrofit=new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
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
