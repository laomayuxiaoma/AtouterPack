package com.muheda.communicationinterface.util;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author zhangming
 * @Date 2019/8/15 13:50
 * @Description: 用于路由的初始化
 */
public class BaseLib {
    public static void init(Context context){
        ARouter.init((Application) context);
    }
}
