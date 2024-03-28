package practice.linkedList.circularLinkedList.list;

import practice.linkedList.circularLinkedList.adt.CircularLinkedList;
import practice.linkedList.circularLinkedList.node.CircularNode;
import practice.linkedList.doublyLinkedLIst.adt.DoublyLinkedList;
import practice.linkedList.doublyLinkedLIst.node.DoublyNode;

public class IntegerCircularLinkedListImpl implements CircularLinkedList {
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
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addFirst(int data) {

    }

    @Override
    public CircularNode search(int data) {
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
