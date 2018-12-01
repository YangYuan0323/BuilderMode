package com.main.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.main.activity.com.main.bean.XiaoMing;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XiaoMing xiaoming = new XiaoMing.Builder().setAge(10).setSex(0).setTotalMoney(10000).build();



    }
}
