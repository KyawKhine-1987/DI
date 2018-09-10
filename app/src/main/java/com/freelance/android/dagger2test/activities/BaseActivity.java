package com.freelance.android.dagger2test.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.freelance.android.dagger2test.Dagger2Application;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    private static final String LOG_TAG = BaseActivity.class.getName();

    @Inject
     SharedPreferences prefs;
    @Inject
    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(LOG_TAG, "TEST: onCreate() is called...");

        super.onCreate(savedInstanceState);
        ((Dagger2Application) getApplication()).getAppComponent().inject(this);
    }
}
