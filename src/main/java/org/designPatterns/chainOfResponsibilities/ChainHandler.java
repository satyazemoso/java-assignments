package org.designPatterns.chainOfResponsibilities;

public interface ChainHandler {
    public void setNextHandler(ChainHandler chainHandler);
    public void calculate(Numbers numbers);
}
