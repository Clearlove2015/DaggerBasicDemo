package com.odbpo.fenggo.dagger_basic_demo.di;

import com.odbpo.fenggo.dagger_basic_demo.MainActivity;
import com.odbpo.fenggo.dagger_basic_demo.di.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Component;

@ActivityScope
@Component(modules = {ApiModule.class},dependencies = AppComponent.class)
public interface ApiComponent {

    void inject(MainActivity activity);

}
