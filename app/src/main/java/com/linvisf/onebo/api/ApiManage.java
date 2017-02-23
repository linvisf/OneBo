package com.linvisf.onebo.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by linhong on 2017/1/6.
 * <p>
 * 描述：
 */

public class ApiManage {

    public static final String BASE_URL_GANK = "http://gank.io";
    public static final int DEFAULT_COUNT = 10;
    public static final int DEFAULT_TIMEOUT = 10;

    public static ApiManage instance;
    public GankApi mGankApi;
    private Object apiObject = new Object();

    public static ApiManage getInstance() {
        if (instance == null) {
            synchronized (ApiManage.class) {
                if (instance == null) {
                    instance = new ApiManage();
                }
            }
        }
        return instance;
    }

    private OkHttpClient mClient = new OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build();

    public GankApi getGankApi() {
        if (mGankApi == null) {
            synchronized (apiObject) {
                if (mGankApi == null) {
                    mGankApi = new Retrofit.Builder()
                            .baseUrl(BASE_URL_GANK)
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .client(mClient)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build().create(GankApi.class);
                }
            }
        }
        return mGankApi;
    }
}
