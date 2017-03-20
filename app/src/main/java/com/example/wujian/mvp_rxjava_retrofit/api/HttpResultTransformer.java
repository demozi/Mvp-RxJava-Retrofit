package com.example.wujian.mvp_rxjava_retrofit.api;

import com.example.wujian.mvp_rxjava_retrofit.entity.HttpResult;

import rx.Observable;
import rx.functions.Func1;

/**
 *
 * 统一处理返回的数据
 * Created by wujian on 2016/12/12.
 */

public class HttpResultTransformer<T> implements Observable.Transformer<HttpResult<T>, T> {


    @Override
    public Observable<T> call(Observable<HttpResult<T>> source) {
        return source.map(new Func1<HttpResult<T>, T>() {
            @Override
            public T call(HttpResult<T> httpResult) {
                if (httpResult.getCode() != 200) {
                    // 可以对返回code 统一处理
                    throw new ApiException(httpResult.getCode());
                }
                return httpResult.getData();
            }
        });
    }
}
