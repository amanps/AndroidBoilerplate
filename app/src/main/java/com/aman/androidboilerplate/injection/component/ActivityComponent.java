package com.aman.androidboilerplate.injection.component;

import dagger.Subcomponent;
import com.aman.androidboilerplate.injection.PerActivity;
import com.aman.androidboilerplate.injection.module.ActivityModule;
import com.aman.androidboilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
