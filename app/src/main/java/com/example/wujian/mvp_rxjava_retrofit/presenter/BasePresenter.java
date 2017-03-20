package com.example.wujian.mvp_rxjava_retrofit.presenter;

import android.util.Log;

import com.example.wujian.mvp_rxjava_retrofit.api.ApiException;
import com.example.wujian.mvp_rxjava_retrofit.view.IRxView;

/**
 * Created by wujian on 2016/10/17.
 */

public class BasePresenter implements IBasePresenter {

    public final String TAG = BasePresenter.class.getSimpleName();

    private IRxView mView;

    public BasePresenter(IRxView view) {
        this.mView = view;
    }

    @Override
    public void dealNetError(Throwable e) {
        if (e instanceof ApiException) {
            ApiException apiException = (ApiException) e;

            // TODO: 2016/12/12 处理统一定义的code
            switch (apiException.getErrorCode()) {
                case ApiException.NEED_LOGIN:
                    mView.goTologinPage();
                    break;
            }

            Log.e(TAG, "ApiException -- " + ((ApiException) e).getErrorCode());
        }else {
            mView.showServerErrorView();
        }
    }

}
