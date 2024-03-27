package practice.stack.stackLinkedList.main;

import practice.stack.stackLinkedList.list.IntegerstackByLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        IntegerstackByLinkedListImpl integerstackByLinkedList=new IntegerstackByLinkedListImpl();
        int n=integerstackByLinkedList.getSize();
        System.out.println("n = " + n);
        System.out.println("integerstackByLinkedList.isEmpty() = " + integerstackByLinkedList.isUnderFlow());
        integerstackByLinkedList.push(25);
        integerstackByLinkedList.push(50);
        integerstackByLinkedList.push(20);
        integerstackByLinkedList.push(2);
        integerstackByLinkedList.push(5);
        integerstackByLinkedList.pop();
        System.out.println("integerstackByLinkedList.peek() = " + integerstackByLinkedList.peek());
    }
}
