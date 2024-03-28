package practice.linkedList.circularLinkedList.node;

public class CircularNode {
    CircularNode next;
    CircularNode previous;
    int data;

    public CircularNode(CircularNode next, CircularNode previous, int data) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public CircularNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CircularNode{" + "next=" + next + ", previous=" + previous + ", data=" + data + '}';
    }
}
