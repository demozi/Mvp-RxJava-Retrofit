package com.example.wujian.mvp_rxjava_retrofit.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wujian.mvp_rxjava_retrofit.R;
import com.example.wujian.mvp_rxjava_retrofit.dagger.ModuleProvider;
import com.example.wujian.mvp_rxjava_retrofit.dagger.component.DaggerPTStatusComponent;
import com.example.wujian.mvp_rxjava_retrofit.entity.PinTuanStatus;
import com.example.wujian.mvp_rxjava_retrofit.presenter.IPTStatusPresenter;
import com.example.wujian.mvp_rxjava_retrofit.view.IPTStatusView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 拼团状态  wujian 2016-9-30
 */
public class PinTuanStatusActivity extends BaseActivity implements IPTStatusView {


    @BindView(R.id.text)
    TextView text;


    @Inject
    IPTStatusPresenter mPresenter;

    private String act_id = "64";
    private String act_sn = "890529250752934273";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pintuan_status);

        initData();
        initMvp();
        initViews();

    }

    @Override
    protected void onResume() {
        super.onResume();

        mPresenter.setActSn(act_sn);
        mPresenter.setActId(act_id);
        mPresenter.loadData();
    }

    private void initData() {
//        Bundle data = getIntent().getExtras();
//        if(data != null){
//            act_id = data.getString("act_id");
//            act_sn = data.getString("act_sn");
//        }
    }

    private void initViews() {
        ButterKnife.bind(this);
    }

    private void initMvp() {
        DaggerPTStatusComponent.builder()
                .pTStatusModule(ModuleProvider.getInstance().providePTStatusModule(this))
                .build()
                .inject(this);
    }


    @Override
    public void showActInfoView(PinTuanStatus.ActInfoBean data) {

        text.setText(data.act_name);

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
