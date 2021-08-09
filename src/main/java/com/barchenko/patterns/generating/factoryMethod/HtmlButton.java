package com.barchenko.patterns.generating.factoryMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("html button");
    }
}
