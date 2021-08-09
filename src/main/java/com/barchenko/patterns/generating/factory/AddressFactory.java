package com.barchenko.patterns.generating.factory;

public abstract class AddressFactory {
    public abstract Address createAddress();
    public abstract PhoneNumber createPhoneNumber();
}
