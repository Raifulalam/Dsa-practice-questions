package practice.linkedList.circularLinkedList.node;

public class CircularNode {
    public CircularNode next;
    public CircularNode previous;
    public int data;

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
        //return "CircularNode{" + "next=" + next + ", previous=" + previous + ", data=" + data + '}';
        return "{" + (previous == null ? "null" : previous.data) + " <--> " + this.data + " <--> " + (next == null ? "null" : next.data) + "}";
    }
}
