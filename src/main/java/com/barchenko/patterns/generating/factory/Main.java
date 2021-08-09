package com.barchenko.patterns.generating.factory;

public class Main {
    public static void main(String[] args) {
        AddressFactory factory = new USAAddressFactory();
        Address address = factory.createAddress();
        System.out.println(address);
        PhoneNumber phoneNumber = factory.createPhoneNumber();
        System.out.println(phoneNumber);
    }
}
