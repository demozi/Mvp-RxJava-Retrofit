package com.example.wujian.mvp_rxjava_retrofit.dagger.module;

import android.app.Application;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;


import com.example.wujian.mvp_rxjava_retrofit.dagger.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;


/**
 * Application模块，全局共享
 * Created by lq on 2016/6/24.
 */
@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationScope
    public Context provideApplicationContext() {
        return mApplication;
    }

    @Provides
    @ApplicationScope
    public LocalBroadcastManager provideLocalBroadcastManager(Context context) {
        return LocalBroadcastManager.getInstance(context);
    }

}