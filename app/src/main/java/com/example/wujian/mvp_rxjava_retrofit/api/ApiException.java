package com.example.wujian.mvp_rxjava_retrofit.api;

/**
 * Created by wujian on 2016/12/12.
 */

public class ApiException extends RuntimeException {

    public static final int NEED_LOGIN = 80002;

    private int errorCode;

    public ApiException(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
