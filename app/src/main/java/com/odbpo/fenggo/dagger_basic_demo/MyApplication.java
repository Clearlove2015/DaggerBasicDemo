package com.odbpo.fenggo.dagger_basic_demo;

import android.app.Application;

import com.odbpo.fenggo.dagger_basic_demo.di.AppComponent;
import com.odbpo.fenggo.dagger_basic_demo.di.AppModule;
import com.odbpo.fenggo.dagger_basic_demo.di.DaggerAppComponent;

public class MyApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }
}
