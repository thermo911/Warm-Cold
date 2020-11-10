package com.sd.warmcold;

import android.app.Application;

public class MyApp extends Application {
    private static MyApp INSTANCE = null;
    private Storage storage = new Storage();
    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = new MyApp();
    }

    public static MyApp getInstance() {
        return INSTANCE;
    }

    public Storage getStorage() {
        return storage;
    }
}
