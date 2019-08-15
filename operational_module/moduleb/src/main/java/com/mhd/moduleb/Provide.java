package com.mhd.moduleb;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mhd.arouter.common.RouteConstant;
import com.mhd.arouter.model.communication.CommunicationTestModel;
import com.muheda.communicationinterface.iinterface.ICommunication;
import com.muheda.communicationinterface.model.ParamCommunicationModel;
import com.muheda.communicationinterface.util.ConmunicationHelper;

/**
 * @author zhangming
 * @Date 2019/8/15 13:00
 * @Description: 通信测试交互类
 */
@Route(path = RouteConstant.moduleb_provide)
public class Provide implements ICommunication<CommunicationTestModel> {

    private final String TAG = this.getClass().getName();

    @Override
    public Object iCommunication(ParamCommunicationModel<CommunicationTestModel> params) {
        Log.e(TAG, params.getData().getName());
        return  ConmunicationHelper.invokeMethod(this, params.getData());
    }

    @Override
    public void init(Context context) {

    }

    private Object communicationOne(CommunicationTestModel params) {

        return "communicationOne方法被调用的返回值";
    }

    private Object communicationTwo(CommunicationTestModel params) {

        return "communicationTwo方法被调用的返回值";
    }

}
