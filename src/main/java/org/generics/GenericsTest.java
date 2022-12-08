package org.generics;

public class GenericsTest {
    public static void main(String args[]){
        shout("bigboss");
    }
    public static <T> void shout(T thingToShout){
        System.out.println(thingToShout+" !!!");

    }
}
