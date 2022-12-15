package org.designPatterns.singleton;

import java.io.Serializable;

// the problem with singleton3 is singleton pattern fails incase of serialization and deserialization.
// here we are written a method "readResolve" which is called in case of deserialization.
public class Singleton4 implements Serializable {
    private static Singleton4 singleton4 = null;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
    protected Object readResolve(){
        return singleton4;
    }
}
