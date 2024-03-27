package practice.linkedList.circularLinkedList;

import practice.linkedList.doublyLinkedLIst.adt.DoublyLinkedList;
import practice.linkedList.doublyLinkedLIst.node.DoublyNode;

public class IntegerCircularLinkedListImpl implements DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public IntegerCircularLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void addFirst(int data) {

    }

    @Override
    public DoublyNode search(int data) {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(int data) {

    }

    @Override
    public void remove(int data) {

    }

    @Override
    public void removeFirst() {

    }
}
