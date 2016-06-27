package com.github.ojh.dagger2sample.di.module;

import com.github.ojh.dagger2sample.presenter.LoginPresenter;
import com.github.ojh.dagger2sample.presenter.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
@Module
public class LoginModule {

    private LoginPresenter.LoginView view;

    public LoginModule(LoginPresenter.LoginView view) {
        this.view = view;
    }

    @Provides
    LoginPresenter provideLoginPresenter() {
        return new LoginPresenterImpl(view);
    }

}
