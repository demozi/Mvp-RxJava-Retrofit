package com.example.wujian.mvp_rxjava_retrofit.model;

import com.example.wujian.mvp_rxjava_retrofit.api.ApiManager;
import com.example.wujian.mvp_rxjava_retrofit.api.HttpRequestCallBack;
import com.example.wujian.mvp_rxjava_retrofit.api.HttpResultTransformer;
import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;

import rx.Observable;

/**
 * Created by wujian on 2016/9/23.
 */

public class PTStatusModel implements IPTStatusModel {



    private String act_id;
    private String act_sn;


    @Override
    public Observable<PinTuanStatus> loadData() {
        return ApiManager.getPinTuanStatusData(act_id, act_sn)
                .compose(new HttpResultTransformer<PinTuanStatus>());
    }

    @Override
    public void setActId(String actId) {
        this.act_id = actId;
    }

    @Override
    public void setActSn(String actSn) {
        this.act_sn = actSn;
    }



}
