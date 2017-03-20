package com.example.wujian.mvp_rxjava_retrofit.ui;

import android.os.Bundle;
import android.util.Log;

import com.example.wujian.mvp_rxjava_retrofit.view.IRxView;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.android.ActivityEvent;
import com.trello.rxlifecycle.components.RxActivity;

public class BaseActivity extends RxActivity implements IRxView{

    protected final String TAG = BaseActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void goTologinPage() {
        Log.e(TAG, "goTologinPage");
    }

    @Override
    public void showServerErrorView() {
        Log.e(TAG, "showServerErrorView");
    }

    @Override
    public <T> LifecycleTransformer<T> bindUntilEvent_WJ(ActivityEvent event) {
        return this.<T>bindUntilEvent(event);
    }

    @Override
    public <T> LifecycleTransformer<T> bindToLifecycle_WJ() {
        return this.<T>bindToLifecycle();
    }
}
