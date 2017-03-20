package com.example.wujian.mvp_rxjava_retrofit.dagger.component;

import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;


import com.example.wujian.mvp_rxjava_retrofit.dagger.module.AppModule;
import com.example.wujian.mvp_rxjava_retrofit.dagger.scope.ApplicationScope;

import dagger.Component;

/**
 * Created by lq on 2016/6/24.
 */
@Component(modules = {AppModule.class})
@ApplicationScope
public interface AppComponent {
    Context applicationContext();

    LocalBroadcastManager localBroadcastManager();
}