package com.barchenko.patterns.generating.factory;

public class USAAddress extends Address {
    private final String country = "USA";

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "USAAddress{" +
                "country='" + country + '\'' +
                '}';
    }
}
