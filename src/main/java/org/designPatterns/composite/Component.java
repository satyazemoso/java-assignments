package org.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    List<Component> componentList = new ArrayList<>();
    public abstract int getBalance();
    public abstract AccountStatement getStatement();
    public void add(Component component){
        componentList.add(component);
    }
    public void remove(Component component){
        componentList.remove(component);
    }
    public Component getChild(int index){
       return componentList.get(index);
    }
}
