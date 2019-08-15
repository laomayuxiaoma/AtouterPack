package com.mhd.atouterpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mhd.arouter.common.RouteConstant;
import com.muheda.communicationinterface.util.RouteUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RouteUtil.routeSkip(RouteConstant.modulea_mainact, new String[][]{});
    }
}
