package com.barchenko.patterns.behavioral.chainOfResponsibility;

public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain chain) {
        nextInChain = chain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted().equals("sub")){
            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()-request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
