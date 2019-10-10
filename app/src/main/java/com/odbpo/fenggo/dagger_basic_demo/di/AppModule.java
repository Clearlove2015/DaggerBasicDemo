package com.odbpo.fenggo.dagger_basic_demo.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder().build();
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(){
        return context.getSharedPreferences("sp_dagger",Context.MODE_PRIVATE);
    }

}
