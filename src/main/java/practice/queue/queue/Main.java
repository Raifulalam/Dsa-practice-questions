package practice.queue.queue;

import practice.queue.queue.array.IntegerArrayQueue;

public class Main {
    public static void main(String[] args) {
//        IntegerQueue integerQueue = new IntegerQueue();
//        integerQueue.offer(25);
//        integerQueue.offer(20);
//        integerQueue.remove();
//        integerQueue.offer(50);
//        integerQueue.offer(5);
//        integerQueue.offer(2);
//        integerQueue.offer(35);
//        integerQueue.offer(25);
//        integerQueue.offer(27);
//        integerQueue.offer(55);
//        integerQueue.offer(95);
        IntegerArrayQueue integerArrayQueue = new IntegerArrayQueue(8);
        integerArrayQueue.enqueue(250);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(45);
        integerArrayQueue.enqueue(78);
        integerArrayQueue.dequeue();


    }
}
