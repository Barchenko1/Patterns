package com.barchenko.patterns.generating.factory;

public abstract class PhoneNumber {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract String getCountryCode();


}
