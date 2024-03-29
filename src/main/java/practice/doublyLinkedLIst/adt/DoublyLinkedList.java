package practice.doublyLinkedLIst.adt;

import practice.doublyLinkedLIst.node.DoublyNode;

public interface DoublyLinkedList {
    int getSize();
    void addFirst(int data);
    boolean isEmpty();
    DoublyNode search(int data);
    void print();
    void add(int data);
    void remove(int data);
    void removeFirst();

}
