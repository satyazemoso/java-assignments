package org.designPatterns.chainOfResponsibilities;

public class Main {
    // This pattern sends data to a object and if that object can't use that data it sends to the next object
    public static void main(String args[]){
        ChainHandler addChainHandler = new AddChainHandler();
        ChainHandler subChainHandler = new SubtractChainHandler();
        ChainHandler mulChainHandler = new MultiplyChainHandler();
        ChainHandler divChainHandler = new DivChainHandler();
        addChainHandler.setNextHandler(subChainHandler);
        subChainHandler.setNextHandler(mulChainHandler);
        mulChainHandler.setNextHandler(divChainHandler);
        Numbers numbers1 = new Numbers(4,2,"add");
        addChainHandler.calculate(numbers1);
        Numbers numbers2 = new Numbers(4,2,"subtract");
        addChainHandler.calculate(numbers2);
        Numbers numbers3 = new Numbers(4,2,"multiply");
        addChainHandler.calculate(numbers3);
        Numbers numbers4 = new Numbers(4,2,"power");
        addChainHandler.calculate(numbers4);
    }
}
