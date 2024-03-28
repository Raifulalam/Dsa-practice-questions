package practice.linkedList.circularLinkedList.list;

import practice.linkedList.circularLinkedList.adt.CircularLinkedList;
import practice.linkedList.circularLinkedList.node.CircularNode;

public class IntegerCircularLinkedListImpl implements CircularLinkedList {
    CircularNode head;
    CircularNode tail;
    int size;

    public IntegerCircularLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void makeCircular() {
        if (head != null) {
            tail.next = head;
            head.previous = tail;
        }
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
        CircularNode node=new CircularNode(data);
        if(isEmpty()){
            tail = node;
        }else{
            head.previous=node;
        }
        node.next=head;
        head=node;
        size++;
        makeCircular();
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
