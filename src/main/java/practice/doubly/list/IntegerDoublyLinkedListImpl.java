package practice.doubly.list;

import practice.doubly.adt.DoublyLinkedList;
import practice.doubly.node.DoublyNode;

public class IntegerDoublyLinkedListImpl implements DoublyLinkedList {
    int size;
    DoublyNode head;
    DoublyNode tail;

     public IntegerDoublyLinkedListImpl() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addFirst(int data) {
       DoublyNode node=new DoublyNode(data);
       if(isEmpty()){
           tail = node;
       }else{
           head.previous=node;
       }
       node.next=head;
       head=node;
       size++;
    }

    @Override
    public boolean isEmpty() {
        return  size==0;
    }

    @Override
    public DoublyNode search(int data) {
            DoublyNode temp=head;
            while(temp!=null){
                if(temp.data==data){
                    return temp;
                }
                temp=temp.next;

         }
        return null;
    }

    @Override
    public void print() {
         DoublyNode currentNode=head;
        while(currentNode!=null){
            System.out.println(currentNode);
            currentNode=currentNode.next;
        }
    }

    @Override
    public void add(int data) {

            if(isEmpty()){
                addFirst(data);
            }else{
                DoublyNode node=new DoublyNode(data,null,tail);
                tail.next=node;
                tail=node;
                size++;
            }
    }

    @Override
    public void remove(int data) {

    }
}
