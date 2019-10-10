package com.odbpo.fenggo.dagger_basic_demo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.odbpo.fenggo.dagger_basic_demo.constant.ConstantKey;
import com.odbpo.fenggo.dagger_basic_demo.di.ApiModule;
import com.odbpo.fenggo.dagger_basic_demo.di.DaggerTestComponent;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class LoginActivity extends AppCompatActivity {

    @Inject
    OkHttpClient client;

    @Inject
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DaggerTestComponent.builder()
                .apiModule(new ApiModule(this))
                .appComponent(MyApplication.getAppComponent())
                .build()
                .inject(this);

        System.out.println("zc test Singleton LoginActivity " + client);
        System.out.println("zc test Singleton LoginActivity sp " + sp);

        String str = sp.getString(ConstantKey.TEMP_KEY, "");
        System.out.println("zc sp get data LoginActivity:" + str);
        Toast.makeText(this,"获取保存的数据：" + str,Toast.LENGTH_SHORT).show();
    }
}
