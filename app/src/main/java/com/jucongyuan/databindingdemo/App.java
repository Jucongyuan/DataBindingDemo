package com.jucongyuan.databindingdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 3:25 PM
 */
public class App extends Application {

    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        app = this;
    }


}
