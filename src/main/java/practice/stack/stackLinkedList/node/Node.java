package practice.stack.stackLinkedList.node;

public class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", head=" + next + '}';
    }
}
