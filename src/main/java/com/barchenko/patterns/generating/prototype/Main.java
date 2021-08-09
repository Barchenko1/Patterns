package com.barchenko.patterns.generating.prototype;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Tr", "Kiev", "CA", "90210");
        System.out.println(address);
        Address addressCopy = (Address) address.copy();
        System.out.println(addressCopy);
        System.out.println(addressCopy.getCity());
    }
}
