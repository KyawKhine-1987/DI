package com.freelance.android.dagger2test.dagger2;

import android.content.Context;
import android.content.SharedPreferences;

import com.freelance.android.dagger2test.Dagger2Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/***
 * Here is object class which is added, implemented and returned what u need to do this class.
 */
@Module
public class AppModule {

    private final Dagger2Application application;

    public AppModule(Dagger2Application app) {
        this.application = app;
    }

    //added, implemented & returned Application Context
    @Provides
    @Singleton
    Context providesApplicationContext() {
        return application;
    }

    //added, implemented & returned SharedPreferences
    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context app) {
        return app.getSharedPreferences("My_Prefs_Title", Context.MODE_PRIVATE);
    }
}
