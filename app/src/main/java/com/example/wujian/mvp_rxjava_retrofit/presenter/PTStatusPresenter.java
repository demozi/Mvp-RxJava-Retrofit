package com.example.wujian.mvp_rxjava_retrofit.presenter;

import android.nfc.Tag;
import android.util.Log;

import com.example.wujian.mvp_rxjava_retrofit.api.ApiException;
import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;
import com.example.wujian.mvp_rxjava_retrofit.model.IPTStatusModel;
import com.example.wujian.mvp_rxjava_retrofit.view.IPTStatusView;
import com.trello.rxlifecycle.android.ActivityEvent;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

/**
 * Created by wujian on 2016/9/30.
 */

public class PTStatusPresenter extends BasePresenter implements IPTStatusPresenter {


    private IPTStatusView mView;
    private IPTStatusModel mModel;

    private PinTuanStatus mData;


    public PTStatusPresenter(IPTStatusView view, IPTStatusModel model) {
        super(view);
        this.mView = view;
        this.mModel = model;
    }

    @Override
    public void loadData() {

        mModel.loadData()
                .doOnUnsubscribe(new Action0() {
                    @Override
                    public void call() {
                        Log.e(TAG, "task  cancel");
                    }
                })
                .compose(mView.<PinTuanStatus>bindUntilEvent_WJ(ActivityEvent.DESTROY))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<PinTuanStatus>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        dealNetError(e);
                    }

                    @Override
                    public void onNext(PinTuanStatus pinTuanStatus) {
                        mView.showActInfoView(pinTuanStatus.act_info);
                    }
                });
    }

    @Override
    public void setActId(String actId) {
        mModel.setActId(actId);
    }

    @Override
    public void setActSn(String actSn) {
        mModel.setActSn(actSn);
    }


}
