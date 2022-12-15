package org.designPatterns.composite;

public class Main {
    public static void main(String args[]){
        Component savingsAccount1 = new SavingsAccount(123,44);
        Component savingsAccount2 = new SavingsAccount(456,77);
        Component depositAccount1 = new DepositAccount(789,99);
        CompositeAccount compositeAccount = new CompositeAccount();
        compositeAccount.add(savingsAccount1);
        compositeAccount.add(savingsAccount2);
        compositeAccount.add(depositAccount1);
        System.out.println(compositeAccount.getBalance());
    }
}
