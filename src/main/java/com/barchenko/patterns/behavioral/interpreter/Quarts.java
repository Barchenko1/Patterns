package com.barchenko.patterns.behavioral.interpreter;

public class Quarts extends Expression{
    @Override
    String gallons(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    String quarts(double quantity) {
        return Double.toString(quantity);
    }
}
