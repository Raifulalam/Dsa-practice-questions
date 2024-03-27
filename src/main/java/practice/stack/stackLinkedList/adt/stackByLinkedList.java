package practice.stack.stackLinkedList.adt;

public interface stackByLinkedList {
    int getSize();
    boolean isUnderFlow();
    void push(int data);
    void pop();
    int peek();
}
