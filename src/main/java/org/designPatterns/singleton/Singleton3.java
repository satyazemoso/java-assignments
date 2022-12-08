package org.designPatterns.singleton;

// the problem with singleton2 solution is resource wastage, i,e the object is created even if it is not used.
// here we added synchronized block to make sure only one intance is created even in case of multi threaded.
public class Singleton3 {

    private static Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(singleton3 == null){
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;

    }
}
