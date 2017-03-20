package com.example.wujian.mvp_rxjava_retrofit.model;


import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;

import rx.Observable;

/**
 * Created by wujian on 2016/9/30.
 */
public interface IPTStatusModel {

    Observable<PinTuanStatus> loadData();

    void setActId(String actId);

    void setActSn(String actSn);

}