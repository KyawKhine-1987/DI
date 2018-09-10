package com.freelance.android.dagger2test.dagger2;

import com.freelance.android.dagger2test.activities.BaseActivity;
import com.freelance.android.dagger2test.Dagger2Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
/*@Component(modules = {AppModule.class, PhoneModule.class})   add here whatever you used to Module in yr application.*/
public interface AppComponent {

    void inject(Dagger2Application application);
    void inject(BaseActivity mBaseActivity);
}
