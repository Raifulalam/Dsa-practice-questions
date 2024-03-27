package practice.linkedList.doublyLinkedLIst.node;

public class DoublyNode {
    public int data;
    public DoublyNode previous;
    public DoublyNode next;

    public DoublyNode(int data, DoublyNode next, DoublyNode previous) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public DoublyNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        //return "DoublyNode{" + "data=" + data + ", previous=" + previous + ", next=" + next + '}';
        return "{" + (previous == null ? "null" : previous.data) + " <--> " + this.data + " <--> " + (next == null ? "null" : next.data) + "}";

    }


}
