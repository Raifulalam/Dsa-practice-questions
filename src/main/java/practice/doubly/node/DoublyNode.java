package practice.doubly.node;

public class DoublyNode {
    DoublyNode next;
    DoublyNode previous;
    int data;

    public DoublyNode(DoublyNode next, DoublyNode previous, int data) {
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
