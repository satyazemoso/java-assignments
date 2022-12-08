package org.assignment10;

public class JavaAssignment10 {
    public static void main(String args[]) {
        SList<String> sList = new SList<String>();
        SListIterator<String> sListIterator = sList.iterator();
        // insreting data into sList
        sListIterator.insert(sList, "data1");
        sListIterator.insert(sList, "data2");
        sListIterator.insert(sList, "data3");
        // delete first node in sList
        sListIterator.deleteFromBegining(sList);
        // printing all elements of list
        Node node = sList.head;
        while (node != null) {
            System.out.println("data=" + node.getData());
            node = node.getNext();
        }


    }
}
