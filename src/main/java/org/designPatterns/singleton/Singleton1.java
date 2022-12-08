package org.designPatterns.singleton;

import java.io.Serializable;

public class Singleton1 implements Serializable {
    private static Singleton1 singleton1;
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
