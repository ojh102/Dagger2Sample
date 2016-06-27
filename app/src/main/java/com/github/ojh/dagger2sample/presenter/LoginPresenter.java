package com.github.ojh.dagger2sample.presenter;

import com.github.ojh.dagger2sample.model.User;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
public interface LoginPresenter {

    void login(User user);

    interface LoginView {
        void moveToMain();
        void showLoginFailMessage();
    }
}
