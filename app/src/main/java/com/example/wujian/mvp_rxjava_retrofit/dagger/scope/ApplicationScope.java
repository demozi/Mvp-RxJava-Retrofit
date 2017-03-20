package com.example.wujian.mvp_rxjava_retrofit.dagger.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by lq on 2016/6/24.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ApplicationScope {
}
