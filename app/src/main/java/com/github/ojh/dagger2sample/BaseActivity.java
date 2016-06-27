package com.github.ojh.dagger2sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dependancyInjection();
    }

    protected abstract void dependancyInjection();
}
