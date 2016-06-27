package com.github.ojh.dagger2sample.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by JaeHwan Oh on 2016-06-27.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {}
