package practice.stack.stackLinkedList.list;

import practice.stack.stackLinkedList.adt.stackByLinkedList;
import practice.stack.stackLinkedList.node.Node;

public class IntegerstackByLinkedListImpl implements stackByLinkedList {
    Node head;
    int size;

    public IntegerstackByLinkedListImpl() {
        this.head=null;
        this.size =0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isUnderFlow() {
        return size==0;
    }

    @Override
    public void push(int data) {
        this.head=new Node(data,this.head);
        size++;
    }
    @Override
    public void pop() {
        if(head==null){
            System.err.println("StackUnderFlow");
        }else {
            Node temp=head;
            temp=head.next;
            head=temp;
            size--;

        }

    }

    @Override
    public int peek() {
        return head.data;
    }
}
