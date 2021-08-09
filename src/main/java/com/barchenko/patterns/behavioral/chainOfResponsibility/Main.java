package com.barchenko.patterns.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();

        chain1.setNextChain(chain2);

        Numbers request = new Numbers(3,2,"sub");
        chain1.calculate(request);
    }
}
