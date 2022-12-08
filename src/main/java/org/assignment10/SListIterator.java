package org.assignment10;

public class SListIterator<T> {

    public void insert(SList<T> sList, T data) {
        Node newNode = new Node(data);
        if (sList.head == null) {
            sList.head = newNode;
            return;
        }
        Node tail = sList.head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(newNode);
    }

    public void deleteFromBegining(SList sList) {
        if (sList == null || sList.head == null) {
            System.out.println("List is empty");
        } else {

            if (sList.head.getNext() == null) {
                sList.head = null;
            } else {
                sList.head = sList.head.getNext();
            }

        }

    }

}
