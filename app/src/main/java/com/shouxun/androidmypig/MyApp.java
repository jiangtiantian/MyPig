package com.shouxun.androidmypig;

import android.app.Application;
import android.content.Context;



/**
 * Created by 甜甜 on 2017/9/6.
 */

public class MyApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }
    public static Context getContext(){
        return context;
    }
}
