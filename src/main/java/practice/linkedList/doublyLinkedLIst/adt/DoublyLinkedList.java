package practice.linkedList.doublyLinkedLIst.adt;

import practice.linkedList.doublyLinkedLIst.node.DoublyNode;

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
