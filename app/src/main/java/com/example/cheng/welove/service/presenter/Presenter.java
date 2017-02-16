package com.example.cheng.welove.service.presenter;

import android.content.Intent;

import com.example.cheng.welove.service.view.View;

/**
 * presenter主要用于网络的请求以及数据的获取
 * 通常也就用到了onCreate和onStop，
 * <p>
 * Created by cheng on 2017/2/16.
 */
public interface Presenter {
    void onCreate();

    //暂时没用到
    void onStart();


    void onStop();

    //暂时没用到
    void pause();


    void attachView(View view);

    //暂时没用到
    void attachIncomingIntent(Intent intent);
}
