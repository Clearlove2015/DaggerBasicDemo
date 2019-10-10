package com.odbpo.fenggo.dagger_basic_demo;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.odbpo.fenggo.dagger_basic_demo.constant.ConstantKey;
import com.odbpo.fenggo.dagger_basic_demo.di.ApiModule;
import com.odbpo.fenggo.dagger_basic_demo.di.DaggerApiComponent;
import com.odbpo.fenggo.dagger_basic_demo.net.ApiManager;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    ApiManager apiManager;

    @Inject
    OkHttpClient client1;

    @Inject
    OkHttpClient client2;

    @Inject
    SharedPreferences sp1;

    @Inject
    SharedPreferences sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApiComponent.builder()
                .apiModule(new ApiModule(this))
                .appComponent(MyApplication.getAppComponent())
                .build()
                .inject(this);
    }

    public void onclick(View view) {
        System.out.println("zc test Singleton MainActivity " + client1);
        System.out.println("zc test Singleton MainActivity " + client2);

        System.out.println("zc test Singleton MainActivity sp " + sp1);
        System.out.println("zc test Singleton MainActivity sp " + sp2);

        SharedPreferences.Editor editor = sp1.edit();
        editor.putString(ConstantKey.TEMP_KEY,"dagger singleton");
        editor.commit();
        System.out.println("zc sp save data MainActivity:dagger singleton");

        startActivity(new Intent(this,LoginActivity.class));
    }
}
