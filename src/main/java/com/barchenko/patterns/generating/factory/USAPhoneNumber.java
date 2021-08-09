package com.barchenko.patterns.generating.factory;

public class USAPhoneNumber extends PhoneNumber {
    private final String countryCode = "01";

    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return "USAPhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                '}';
    }
}
