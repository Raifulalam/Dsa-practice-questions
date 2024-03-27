package practice.stack.stackArray;

import practice.stack.stackLinkedList.adt.stackByLinkedList;

public class IntegerstackByLinkedListImpl implements stackByLinkedList {
    private final int[] array;
    int size;
    int top;

    public IntegerstackByLinkedListImpl(int capacity) {
        this.array = new int[capacity];
        size=0;
        top=-1;

    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isUnderFlow() {
        return top==-1;
    }

    @Override
    public void push(int data) {
            if(top==array.length-1){
                System.err.println("Stack OverFlow");
                return;
            }
            top++;
            array[top]=data;
            size++;
    }

    @Override
    public void pop() {
        if(isUnderFlow()){
            System.out.println("Stack UnderFLow");
        }
        array[top--]=0;
        size--;
    }

    @Override
    public int peek() {
        if(isUnderFlow()) {
            System.err.print("Stack UnderFlow"+" ");
            return Integer.MAX_VALUE;
        }
        return array[top];
    }
}
