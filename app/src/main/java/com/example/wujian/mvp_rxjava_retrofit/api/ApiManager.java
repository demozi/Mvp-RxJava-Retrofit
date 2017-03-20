package com.example.wujian.mvp_rxjava_retrofit.api;

import com.example.wujian.mvp_rxjava_retrofit.entity.HttpResult;
import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by wujian on 2016/10/15.
 */

public class ApiManager {

    private static final String BASE_URL = "http://online.aigegou.com";
    private static final String CLIENT_TYPE = "android";


    private static final Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();

    private static final ApiManagerService managerService = retrofit.create(ApiManagerService.class);


    public static Observable<HttpResult<PinTuanStatus>> getPinTuanStatusData(String act_id, String act_sn) {
        return managerService.getPinTuanStatusData(CLIENT_TYPE, act_id, act_sn);
    }

}
