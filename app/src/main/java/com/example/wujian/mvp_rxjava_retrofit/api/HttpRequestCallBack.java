package com.example.wujian.mvp_rxjava_retrofit.api;

/**
 * Created by wujian on 2016/10/17.
 */

public interface HttpRequestCallBack<T> {

    void onSuccess(T data);

    void onFailure(Throwable e);

}
