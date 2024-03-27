package practice.stack.stackArray;

public class Main {
    public static void main(String[] args) {
        IntegerstackByLinkedListImpl integerstackByLinkedList=new IntegerstackByLinkedListImpl(20);
        integerstackByLinkedList.push(20);
        integerstackByLinkedList.push(32);
        integerstackByLinkedList.push(15);
        integerstackByLinkedList.push(19);
        integerstackByLinkedList.push(12);
        integerstackByLinkedList.pop();
        integerstackByLinkedList.pop();
        integerstackByLinkedList.pop();
        integerstackByLinkedList.pop();
        integerstackByLinkedList.pop();
        System.out.println("integerstackByLinkedList.peek() = " + integerstackByLinkedList.peek());
    }
}
