package com.odbpo.fenggo.dagger_basic_demo.di;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    OkHttpClient provideOkHttpClient();
    SharedPreferences provideSharedPreferences();
}
