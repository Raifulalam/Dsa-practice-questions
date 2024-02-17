package main;

import list.IntegerSinglyLinkedListImpl;
import node.Node;
public class Main {
    public static void main(String[] args) {
        IntegerSinglyLinkedListImpl list=new IntegerSinglyLinkedListImpl();
        list.addFirst(98);
        list.addAtEnd(36);
        list.print();
    }
}
