package com.mhd.atouterpack;

import android.app.Application;

import com.muheda.communicationinterface.util.BaseLib;

/**
 * @author zhangming
 * @Date 2019/8/15 13:52
 * @Description: 自定义application
 */
public class MApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseLib.init(this);
    }
}
