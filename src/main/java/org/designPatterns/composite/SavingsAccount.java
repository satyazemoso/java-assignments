package org.designPatterns.composite;

public class SavingsAccount extends Component{
    int accountNumber;
    int balance;
    private AccountStatement accountStatement;
    public SavingsAccount(int accountNumber,int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public AccountStatement getStatement() {
        return accountStatement;
    }
}
