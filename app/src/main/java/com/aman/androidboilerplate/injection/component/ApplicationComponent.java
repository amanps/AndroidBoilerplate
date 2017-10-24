package com.aman.androidboilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.aman.androidboilerplate.data.DataManager;
import com.aman.androidboilerplate.data.SyncService;
import com.aman.androidboilerplate.data.local.DatabaseHelper;
import com.aman.androidboilerplate.data.local.PreferencesHelper;
import com.aman.androidboilerplate.data.remote.RibotsService;
import com.aman.androidboilerplate.injection.ApplicationContext;
import com.aman.androidboilerplate.injection.module.ApplicationModule;
import com.aman.androidboilerplate.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
