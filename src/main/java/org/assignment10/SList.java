package org.assignment10;

public class SList<T> {

    Node<T> head;

    public SListIterator<T> iterator(){
       return new SListIterator<T>();
    }

}
