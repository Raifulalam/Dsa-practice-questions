package practice.queue.queue.singly;

import practice.queue.adt.Queue;
import practice.queue.node.QueueNode;

public class IntegerQueue implements Queue {
    QueueNode front;
    QueueNode rear;
    int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void offer(int data) {
        QueueNode node = new QueueNode(data);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    @Override
    public int remove() {
        if (isEmpty()) {
            System.err.println("Queue is Empty!");
            return Integer.MIN_VALUE;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return removed;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.err.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

}
