package org.designPatterns.chainOfResponsibilities;

public class MultiplyChainHandler implements ChainHandler{

    ChainHandler nextChainHandler;
    @Override
    public void setNextHandler(ChainHandler nextChainHandler) {
        this.nextChainHandler = nextChainHandler;
    }

    @Override
    public void calculate(Numbers numbers) {
        if(numbers.getOperation().equals("multiply")){
            System.out.println(numbers.number1 +" * "+ numbers.number2 + " = "+ (numbers.getNumber1() * numbers.getNumber2()));
        }
        else{
            nextChainHandler.calculate(numbers);
        }

    }
}
