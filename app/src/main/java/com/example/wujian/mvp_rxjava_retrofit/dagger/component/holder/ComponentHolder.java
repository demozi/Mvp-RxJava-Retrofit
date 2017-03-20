package com.example.wujian.mvp_rxjava_retrofit.dagger.component.holder;


import com.example.wujian.mvp_rxjava_retrofit.dagger.component.AppComponent;

/**
 * Created by lq on 2016/7/26.
 */
public class ComponentHolder {

    private static AppComponent sAppComponent;

    public static AppComponent getAppComponent() {
        return sAppComponent;
    }

    public static void setAppComponent(AppComponent component) {
        sAppComponent = component;
    }
}