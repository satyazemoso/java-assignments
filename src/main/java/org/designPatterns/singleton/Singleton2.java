package org.designPatterns.singleton;

// the problem in singleton1 is , multithreaded can create multiple instances
// here it is early creation , so no question of multiple instances
public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
