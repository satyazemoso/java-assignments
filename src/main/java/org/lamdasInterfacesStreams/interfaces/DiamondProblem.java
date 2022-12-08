package org.lamdasInterfacesStreams.interfaces;

interface Interface1{
    default void display(){
        System.out.println("display method of Interface1");
    }
}
interface Interface2 extends Interface1{
    default void display(){
        System.out.println("display method of Interface2");
    }
}

public class DiamondProblem implements Interface1,Interface2 {
    public void display() {
       System.out.println("display of DIamondProblem");
    }
    public static void main(String args[]){
        DiamondProblem diamondProblem = new DiamondProblem();
        diamondProblem.display();
    }
}
