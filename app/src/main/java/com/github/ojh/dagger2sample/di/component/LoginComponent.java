package com.github.ojh.dagger2sample.di.component;

import com.github.ojh.dagger2sample.LoginActivity;
import com.github.ojh.dagger2sample.MainActivity;
import com.github.ojh.dagger2sample.di.module.LoginModule;
import com.github.ojh.dagger2sample.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
    void inject(MainActivity mainActivity);
}
