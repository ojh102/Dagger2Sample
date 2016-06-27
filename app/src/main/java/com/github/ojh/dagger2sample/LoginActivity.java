package com.github.ojh.dagger2sample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.github.ojh.dagger2sample.di.component.ApplicationComponent;
import com.github.ojh.dagger2sample.di.component.DaggerLoginComponent;
import com.github.ojh.dagger2sample.di.component.LoginComponent;
import com.github.ojh.dagger2sample.di.module.LoginModule;
import com.github.ojh.dagger2sample.model.User;
import com.github.ojh.dagger2sample.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginPresenter.LoginView {

    @Inject
    protected LoginPresenter loginPresenter;

    @BindView(R.id.edtID)
    protected EditText edtID;
    @BindView(R.id.edtPassword)
    protected EditText edtPassword;

    private ApplicationComponent applicationComponent;
    private LoginComponent loginComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void dependancyInjection() {
        ButterKnife.bind(this);

        applicationComponent = ((MyApplication) getApplication()).getApplicationComponent();
        (loginComponent = DaggerLoginComponent.builder()
                .applicationComponent(applicationComponent)
                .loginModule(new LoginModule(this))
                .build())
                .inject(this);
    }

    @OnClick(R.id.btnLogin)
    public void onClickLogin() {
        loginPresenter.login(new User(edtID.getText().toString(), edtPassword.getText().toString()));
    }


    @Override
    public void moveToMain() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showLoginFailMessage() {
        Toast.makeText(applicationComponent.context(), "Login Fail", Toast.LENGTH_SHORT).show();
    }
}
