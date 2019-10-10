package com.odbpo.fenggo.dagger_basic_demo.net;

public class ApiManager {

    private ApiService apiService;

    public ApiManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public void login(){
        apiService.login();
    }

    public void register(){
        apiService.register();
    }

}
