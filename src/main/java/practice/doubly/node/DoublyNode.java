package practice.doubly.node;

public class DoublyNode {
    public DoublyNode next;
    public DoublyNode previous;
    int data;

    public DoublyNode(int data,DoublyNode next, DoublyNode previous) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public DoublyNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DoublyNode{" + "next=" + next + ", previous=" + previous + ", data=" + data + '}';
    }
}
