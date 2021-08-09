package com.barchenko.patterns.generating.factory;

public class USAAddressFactory extends AddressFactory{
    @Override
    public Address createAddress() {
        return new USAAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USAPhoneNumber();
    }
}
