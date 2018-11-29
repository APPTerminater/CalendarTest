package com.tongji.lisa1225.calendartest;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;
public class GaodeActivity extends AppCompatActivity {

    private MapView mapView;
    private AMap aMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaode);
        mapView = (MapView)findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        init();

        //返回按钮监听
        //view层的控件和业务层的控件，靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        Button backbtn=(Button)findViewById(R.id.backButton);
        //给btn1绑定监听事件
        backbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent addintent =new Intent(GaodeActivity.this,MainActivity.class);
                //启动
                startActivity(addintent);
            }
        });
        //返回按钮监听结束

    }
    private void init(){
        if(aMap ==null){
            aMap = mapView.getMap();
        }
    }
    @Override
    protected void onResume(){
        super.onResume();
        mapView.onResume();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mapView.onPause();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mapView.onDestroy();
    }
}