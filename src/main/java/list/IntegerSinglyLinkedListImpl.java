package list;

import adt.SinglyLinkedList;
import node.Node;

public class IntegerSinglyLinkedListImpl implements SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public IntegerSinglyLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public Node reverse(Node head) {
        Node previous = null;
        Node currentNode = head;
        Node next = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        return previous;
    }

    @Override
    public void addFirst(int data) {
        this.head = new Node(data, this.head);
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addAtEnd(int data) {

        if (this.isEmpty()) {
            addFirst(data);
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
            size++;
        }

    }

    @Override
    public Node search(int data) {
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        return temp;

    }

    @Override
    public void remove(int position) {
        if (position == 1) {
            removeFirst();
        } else {
            int count = 1;
            Node previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
            size--;
        }
    }

    @Override
    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    @Override
    public void addAt(int value, int position) {
        Node node = new Node(value);
        if (head == null) {
            addFirst(value);
        } else {
            int count = 1;
            Node current = head;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            Node nextnode = current.next;
            node.next = nextnode;
            current.next = node;
            size++;

        }
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            return;
        }

        Node current = head;
        head = head.next;
        current.next = null;

        size--;


    }

    @Override
    public void removeLast() {
        if (head == null) {
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            size--;
        }
    }

    @Override
    public void removeAKey(int key) {
        if (isEmpty()) {
        } else {
            Node temp = head;
            Node previous = null;
            while (temp.data != key) {
                previous = temp;
                temp = temp.next;
            }
            if (temp.next == null) return;
            previous.next = temp.next;
            size--;
        }
    }
}


