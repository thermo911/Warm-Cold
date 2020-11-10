package com.sd.warmcold;

public class Storage {
    private int temp;
    private String cityName;

    public Storage() {
        temp = 0;
        cityName = "Wonderland";
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int t) {
        temp = t;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String name) {cityName = name;}
}
