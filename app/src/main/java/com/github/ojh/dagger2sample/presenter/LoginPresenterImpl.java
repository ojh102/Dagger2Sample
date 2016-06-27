package com.github.ojh.dagger2sample.presenter;

import android.text.TextUtils;

import com.github.ojh.dagger2sample.model.User;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;

    public LoginPresenterImpl(LoginPresenter.LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void login(User user) {
        if(TextUtils.isEmpty(user.getId()) || TextUtils.isEmpty(user.getPassword())) {
            loginView.showLoginFailMessage();
        } else {
            loginView.moveToMain();
        }
    }
}
