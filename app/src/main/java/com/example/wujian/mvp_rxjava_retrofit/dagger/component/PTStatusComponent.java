package com.example.wujian.mvp_rxjava_retrofit.dagger.component;



import com.example.wujian.mvp_rxjava_retrofit.dagger.module.PTStatusModule;
import com.example.wujian.mvp_rxjava_retrofit.dagger.scope.ActivityScope;
import com.example.wujian.mvp_rxjava_retrofit.ui.PinTuanStatusActivity;

import dagger.Component;

/**
 * Created by wujian on 2016/9/30.
 */

@Component(modules = {PTStatusModule.class})
@ActivityScope
public interface PTStatusComponent {

    void inject(PinTuanStatusActivity activity);
}
