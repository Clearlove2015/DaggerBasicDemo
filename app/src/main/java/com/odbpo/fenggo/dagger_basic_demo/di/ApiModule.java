package com.odbpo.fenggo.dagger_basic_demo.di;

import android.content.Context;

import com.odbpo.fenggo.dagger_basic_demo.di.scope.ActivityScope;
import com.odbpo.fenggo.dagger_basic_demo.net.ApiManager;
import com.odbpo.fenggo.dagger_basic_demo.net.ApiService;
import com.odbpo.fenggo.dagger_basic_demo.net.TestService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class ApiModule {

    private Context context;

    public ApiModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    public ApiService provideApiService(OkHttpClient okHttpClient){
        return new ApiService(okHttpClient);
    }

    @Provides
    public TestService provideTestService(){
        return new TestService(context);
    }

    @Provides
    public ApiManager provideApiManager(ApiService apiService){
        return new ApiManager(apiService);
    }

}
