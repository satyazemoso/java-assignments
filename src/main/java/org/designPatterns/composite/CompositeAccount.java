package org.designPatterns.composite;

public class CompositeAccount extends Component{


    @Override
    public int getBalance() {
        int totalBalance = 0;
        for(Component component:componentList){
            totalBalance+=component.getBalance();
        }
        return totalBalance;
    }

    @Override
    public AccountStatement getStatement() {
        AccountStatement consolidatedStatement = null;
        for(Component component:componentList){
            consolidatedStatement.merge(component.getStatement());
        }
        return consolidatedStatement;
    }
}
