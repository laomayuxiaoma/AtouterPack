package com.mhd.modulea.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mhd.arouter.common.RouteConstant;
import com.mhd.arouter.model.communication.CommunicationTestModel;
import com.mhd.modulea.R;
import com.muheda.communicationinterface.communication.CommunicationService;
import com.muheda.communicationinterface.model.ReturnCommunicationModel;

/**
 * @author zhangming
 * @Date 2019/8/15 13:29
 * @Description: modulea的主activity
 */
@Route(path = RouteConstant.modulea_mainact)
public class MainActivity extends FragmentActivity {

    private TextView mCommunicationOne;
    private TextView mCommunicationTwo;
    private CommunicationService<String> mCommunicationService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity_main);
        initView();
        initCommunication();
    }

    private void initView() {
        mCommunicationOne = findViewById(R.id.communication_one);
        mCommunicationTwo = findViewById(R.id.communication_two);
        initListener();
    }

    private void initCommunication() {
        mCommunicationService = new CommunicationService<>();
    }

    private void initListener() {
        mCommunicationOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用muduleb 的communicationOne方法并展示返回值
                ReturnCommunicationModel<String> result = mCommunicationService.communication(new CommunicationTestModel(RouteConstant.moduleb_provide, "张三", "communicationOne"));
                mCommunicationOne.setText(result.getData());
            }
        });
        mCommunicationTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用muduleb 的communicationTwo方法并展示返回值
                ReturnCommunicationModel<String> result = mCommunicationService.communication(new CommunicationTestModel(RouteConstant.moduleb_provide, "张三", "communicationTwo"));
                mCommunicationTwo.setText(result.getData());
            }
        });
    }

}
