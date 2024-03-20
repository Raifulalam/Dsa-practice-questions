package practice.doublyLinkedLIst.main;

import practice.doublyLinkedLIst.list.IntegerDoublyLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        IntegerDoublyLinkedListImpl integerDoublyLinkedList=new IntegerDoublyLinkedListImpl();
        System.out.println("integerDoublyLinkedList.isEmpty() = " + integerDoublyLinkedList.isEmpty());
        System.out.println("integerDoublyLinkedList.getSize() = " + integerDoublyLinkedList.getSize());
        integerDoublyLinkedList.addFirst(15);
        integerDoublyLinkedList.addFirst(36);
        integerDoublyLinkedList.addFirst(12);
        integerDoublyLinkedList.add(15);
        integerDoublyLinkedList.add(66);
        integerDoublyLinkedList.add(84);
        integerDoublyLinkedList.add(15);
        System.out.println("integerDoublyLinkedList.search(15) = " + integerDoublyLinkedList.search(15));
        integerDoublyLinkedList.print();
        integerDoublyLinkedList.remove(66);
        integerDoublyLinkedList.removeFirst();
    }
}
