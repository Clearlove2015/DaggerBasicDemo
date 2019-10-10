package com.odbpo.fenggo.dagger_basic_demo.net;

import okhttp3.OkHttpClient;

public class ApiService {

    private OkHttpClient okHttpClient;

    public ApiService(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public void login(){
        System.out.println("zc ApiService login " + okHttpClient);
    }

    public void register(){
        System.out.println("zc ApiService register " + okHttpClient);
    }

}
