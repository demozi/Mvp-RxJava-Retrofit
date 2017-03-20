package com.example.wujian.mvp_rxjava_retrofit.view;


import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;

import java.util.List;

/**
 * Created by wujian on 2016/9/30.
 */

public interface IPTStatusView extends IRxView{

    void showActInfoView(PinTuanStatus.ActInfoBean data);

}
