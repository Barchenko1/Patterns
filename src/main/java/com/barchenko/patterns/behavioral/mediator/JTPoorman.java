package com.barchenko.patterns.behavioral.mediator;

public class JTPoorman extends Colleague{
    public JTPoorman(Mediator mediator) {
        super(mediator);
        System.out.println("JT Poorman signed up with the stockexchange\n");

    }
}
