package practice.queue.node;

public class QueueNode {
    public int data;
    public QueueNode next;

    public QueueNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
}