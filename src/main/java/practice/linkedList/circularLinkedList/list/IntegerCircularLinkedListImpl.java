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
        CircularNode temp=head;
        while(temp.next!=tail){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    @Override
    public void print() {
        CircularNode currentNode=head.previous;
        while(currentNode!=tail){
            System.out.println(currentNode);
            currentNode=currentNode.next;
            makeCircular();
        }
    }

    @Override
    public void add(int data) {
        if(isEmpty()){
            addFirst(data);
        }else{
            CircularNode node=new CircularNode(data);
            CircularNode temp=tail;
            temp.next=node;
            node.next=tail;
            node.previous=temp;
            tail=node;
            size++;
            makeCircular();
        }
    }
    @Override
    public void remove(int data) {

    }

    @Override
    public void removeFirst() {

    }
}
