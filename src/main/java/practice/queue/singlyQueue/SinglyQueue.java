package practice.queue.singlyQueue;

public class SinglyQueue {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }
    int size;
    Node front;
    Node rear;

    public SinglyQueue() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(){

    }
    public void dequeue(){

    }
    int peek(){
        return 0;
    }
}
