package com.example.wujian.mvp_rxjava_retrofit.view;

import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.android.ActivityEvent;

import rx.Observable;

/**
 * Created by wujian on 2016/12/12.
 */

public interface IRxView {


    public void goTologinPage();

    public void showServerErrorView();

    public <T> LifecycleTransformer<T> bindUntilEvent_WJ(ActivityEvent event);

    public <T> LifecycleTransformer<T> bindToLifecycle_WJ();

}
