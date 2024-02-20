package practice.doubly.adt;

import practice.doubly.node.DoublyNode;

public interface DoublyLinkedList {
    int getSize();
    void addFirst(int data);
    boolean isEmpty();
    DoublyNode search(int data);
    void print();
    void add();
    void remove(int data);

}
