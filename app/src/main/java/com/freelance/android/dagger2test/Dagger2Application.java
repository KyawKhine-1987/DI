package com.freelance.android.dagger2test;

import android.app.Application;
import android.util.Log;

import com.freelance.android.dagger2test.dagger2.AppComponent;
import com.freelance.android.dagger2test.dagger2.AppModule;
import com.freelance.android.dagger2test.dagger2.DaggerAppComponent;

public class Dagger2Application extends Application{

    AppComponent appComponent;
    private static final String LOG_TAG = Dagger2Application.class.getName();

    @Override
    public void onCreate() {
        Log.i(LOG_TAG, "TEST: onCreate() is called...");

        super.onCreate();
        /***
         * DaggerAppComponent word should be built when you didn't run yr app.
         */
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        Log.i(LOG_TAG, "TEST: getAppComponent() getter is called...");

        return appComponent;
    }
}
