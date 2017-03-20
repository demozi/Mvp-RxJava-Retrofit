package com.example.wujian.mvp_rxjava_retrofit.presenter;

import android.app.Activity;

/**
 * Created by wujian on 2016/9/30.
 */

public interface IPTStatusPresenter extends IBasePresenter {

    void loadData();

    void setActId(String actId);

    void setActSn(String actSn);

}
