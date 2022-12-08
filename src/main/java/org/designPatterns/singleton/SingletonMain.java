package org.designPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonMain {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
//        Singleton1 singleton1 = Singleton1.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
//        objectOutputStream.writeObject(singleton1);
//        objectOutputStream.close();
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
//        Singleton1 searializedSingleTon = (Singleton1) objectInputStream.readObject();
//        objectInputStream.close();
//        System.out.println("Before Searialization object hashcode="+singleton1.hashCode());
//        System.out.println("After Searialization object hashcode="+searializedSingleTon.hashCode());

        Singleton4 singleton4 = Singleton4.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(singleton4);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        Singleton4 searializedSingleTon = (Singleton4) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Before Searialization object hashcode="+singleton4.hashCode());
        System.out.println("After Searialization object hashcode="+searializedSingleTon.hashCode());
    }
}
