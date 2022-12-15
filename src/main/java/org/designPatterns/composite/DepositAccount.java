package org.designPatterns.composite;

public class DepositAccount extends Component{
    int balance,accountNumber;
    AccountStatement accountStatement;
    public DepositAccount(int accountNumber,int balance){
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
