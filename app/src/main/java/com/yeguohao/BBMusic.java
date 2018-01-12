package com.yeguohao;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class BBMusic extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
