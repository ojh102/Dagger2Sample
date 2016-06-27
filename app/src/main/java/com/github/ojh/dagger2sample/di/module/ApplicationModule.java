package com.github.ojh.dagger2sample.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides @Singleton
    Context provideContext() {
        return application.getApplicationContext();
    }
}
