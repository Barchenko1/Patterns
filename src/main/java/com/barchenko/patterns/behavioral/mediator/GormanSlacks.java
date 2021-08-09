package com.barchenko.patterns.behavioral.mediator;

public class GormanSlacks extends Colleague{
    public GormanSlacks(Mediator mediator) {
        super(mediator);
        System.out.println("Gorman Slacks signed up with the stockexchange\n");
    }
}
