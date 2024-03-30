package practice.linkedList.circularLinkedList.main;

import practice.linkedList.circularLinkedList.list.IntegerCircularLinkedListImpl;
import practice.linkedList.circularLinkedList.node.CircularNode;

public class Main {
    public static void main(String[] args) {
        IntegerCircularLinkedListImpl integerCircularLinkedList=new IntegerCircularLinkedListImpl();
        System.out.println("integerCircularLinkedList.isEmpty() = " + integerCircularLinkedList.isEmpty());
        integerCircularLinkedList.addFirst(20);
        integerCircularLinkedList.addFirst(10);
        integerCircularLinkedList.addFirst(30);
        System.out.println("integerCircularLinkedList.getSize() = " + integerCircularLinkedList.getSize());
        integerCircularLinkedList.print();
        integerCircularLinkedList.add(59);
        System.out.println("integerCircularLinkedList.search(30) = " + integerCircularLinkedList.search(30));

    }
}
