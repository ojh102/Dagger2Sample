package com.github.ojh.dagger2sample;

import android.app.Application;

import com.github.ojh.dagger2sample.di.component.ApplicationComponent;
import com.github.ojh.dagger2sample.di.component.DaggerApplicationComponent;
import com.github.ojh.dagger2sample.di.module.ApplicationModule;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dependancyInjection();
    }

    private void dependancyInjection() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}