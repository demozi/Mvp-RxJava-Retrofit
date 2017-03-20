package com.example.wujian.mvp_rxjava_retrofit.dagger;

import android.support.annotation.VisibleForTesting;

import com.example.wujian.mvp_rxjava_retrofit.dagger.module.PTStatusModule;
import com.example.wujian.mvp_rxjava_retrofit.view.IPTStatusView;


/**
 * Created by lq on 2016/7/4.
 */
public class ModuleProvider {

    private static ModuleProvider sModuleProvider;

    public static ModuleProvider getInstance() {
        if (sModuleProvider == null) {
            sModuleProvider = new ModuleProvider();
        }
        return sModuleProvider;
    }

    @VisibleForTesting
    public static void setModuleProvider(ModuleProvider provider) {
        sModuleProvider = provider;
    }

    public PTStatusModule providePTStatusModule(IPTStatusView view) {
        return new PTStatusModule(view);
    }


}