package com.barchenko.patterns.behavioral.chainOfResponsibility;

public interface Chain {
    void setNextChain(Chain chain);
    void calculate(Numbers request);
}
