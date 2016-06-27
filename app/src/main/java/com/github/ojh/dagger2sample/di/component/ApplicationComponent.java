package com.github.ojh.dagger2sample.di.component;

import android.content.Context;

import com.github.ojh.dagger2sample.LoginActivity;
import com.github.ojh.dagger2sample.MyApplication;
import com.github.ojh.dagger2sample.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Context context();
}
