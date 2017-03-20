package com.example.wujian.mvp_rxjava_retrofit.dagger.module;


import com.example.wujian.mvp_rxjava_retrofit.dagger.scope.ActivityScope;
import com.example.wujian.mvp_rxjava_retrofit.model.IPTStatusModel;
import com.example.wujian.mvp_rxjava_retrofit.model.PTStatusModel;
import com.example.wujian.mvp_rxjava_retrofit.presenter.IPTStatusPresenter;
import com.example.wujian.mvp_rxjava_retrofit.presenter.PTStatusPresenter;
import com.example.wujian.mvp_rxjava_retrofit.view.IPTStatusView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wujian on 2016/9/30.
 */
@Module
public class PTStatusModule {

    private IPTStatusView mView;

    public PTStatusModule(IPTStatusView view) {
        this.mView = view;
    }

    @Provides
    @ActivityScope
    public IPTStatusView provideView() {
        return mView;
    }

    @Provides
    @ActivityScope
    public IPTStatusModel provideModel() {
        return new PTStatusModel();
    }

    @Provides
    @ActivityScope
    public IPTStatusPresenter providePresenter(IPTStatusView view, IPTStatusModel model) {
        return new PTStatusPresenter(view,model);
    }

}
