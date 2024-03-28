package practice.linkedList.circularLinkedList.adt;

import practice.linkedList.circularLinkedList.node.CircularNode;

public interface CircularLinkedList {
    public int getSize();
    public boolean isEmpty();
    public void addFirst(int data);
    public CircularNode search(int data);
    public void print();
    public void add(int data);
    public void remove(int data);
    public void removeFirst();
}
