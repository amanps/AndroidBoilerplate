package com.aman.androidboilerplate.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.aman.androidboilerplate.injection.component.ApplicationComponent;
import com.aman.androidboilerplate.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
