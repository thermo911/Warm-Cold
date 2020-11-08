package com.sd.warmcold;

public class CurrentCityName {
    private StringBuilder sb = new StringBuilder("not chose");

    public String getCity() {
        return sb.toString();
    }

    public void setCity(String city) {
        sb.replace(0, sb.length(), city);
    }
}
