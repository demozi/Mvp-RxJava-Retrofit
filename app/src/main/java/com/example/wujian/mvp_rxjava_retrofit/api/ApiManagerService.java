package com.example.wujian.mvp_rxjava_retrofit.api;

import com.example.wujian.mvp_rxjava_retrofit.entity.HttpResult;
import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wujian on 2016/10/15.
 */

public interface ApiManagerService {

    //定义接口
    @POST("/mobile/index.php?act=mall_unlimited_action&op=mall_act_status")
    @FormUrlEncoded
    Observable<HttpResult<PinTuanStatus>> getPinTuanStatusData(@Field("client_type") String client_type,
                                                @Field("act_id") String act_id,
                                                @Field("act_sn") String act_sn);
}
