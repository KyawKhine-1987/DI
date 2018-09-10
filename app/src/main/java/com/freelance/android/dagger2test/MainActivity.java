package com.freelance.android.dagger2test;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private static final String LOG_TAG = MainActivity.class.getName();
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "TEST: onCreate() is called...");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = this.findViewById(R.id.textview1);

        Log.d(LOG_TAG, "TEST: onCreate() => Before the change : " + prefs.getInt("Number", 0));

        prefs.edit().putInt("Number", 6).apply();

       /*createFromPath is deprecated.
        String bgColor = mContext.getResources().getColor(android.R.color.holo_blue_dark)+"";
        tv.setBackground(Drawable.createFromPath((bgColor)));*/

       tv.setTextColor(mContext.getResources().getColor(R.color.colorWhite));
       tv.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));

        Log.d(LOG_TAG, "TEST: onCreate() => After the change : " + prefs.getInt("Number", 0));
    }
}
