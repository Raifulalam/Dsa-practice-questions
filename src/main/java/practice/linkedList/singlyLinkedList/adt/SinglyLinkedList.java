package practice.linkedList.singlyLinkedList.adt;

import practice.linkedList.singlyLinkedList.node.Node;

public interface SinglyLinkedList {
        Node reverse(Node head);
        void addFirst(int data);
        boolean isEmpty();
        int getSize();
        void addAtEnd(int data);

        Node search(int data);
        void remove(int position);
        void print();
        void addAt(int value, int position);
        void removeFirst();
        void removeLast();
        void removeAKey(int key);

}
