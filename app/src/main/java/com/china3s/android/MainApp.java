package com.china3s.android;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by ZZQ。 on 2014/9/20.
 */
public class MainApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    /**
     * Toast
     *
     * @param resId message resource id
     */
    public static void showToast(int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

    /**
     * Toast
     *
     * @param message message
     */
    public static void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
