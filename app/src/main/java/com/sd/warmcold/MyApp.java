package com.sd.warmcold;

import android.app.Application;

public class MyApp extends Application {
    private static MyApp INSTANCE = null;
    private ChosenTemperatureStorage temperatureStorage = new ChosenTemperatureStorage();
    private CurrentCityName curCityName = new CurrentCityName();

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = new MyApp();
    }

    public static MyApp getInstance() {
        return INSTANCE;
    }

    public ChosenTemperatureStorage getTemperatureStorage() {
        return temperatureStorage;
    }

    public CurrentCityName getCurCityName() {
        return curCityName;
    }
}
