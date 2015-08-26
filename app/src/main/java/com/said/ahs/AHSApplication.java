package com.said.ahs;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.GINGERBREAD;


import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Said on 19/8/15.
 */
public class AHSApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        enabledStrictMode();
        LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher(Context context) {
        AHSApplication application = (AHSApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private RefWatcher refWatcher;

    private void enabledStrictMode() {
        if (SDK_INT >= GINGERBREAD) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder() //
                    .detectAll() //
                    .penaltyLog() //
                    .penaltyDeath() //
                    .build());
        }
    }
}
