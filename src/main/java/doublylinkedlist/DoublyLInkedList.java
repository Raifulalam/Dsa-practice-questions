package doublylinkedlist;
public class DoublyLInkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public DoublyLInkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public class ListNode{
        private ListNode next;
        private ListNode previous;
        int data;

        public ListNode(int data) {
            this.data=data;
        }
    }
    boolean isEmpty(){
        return size==0;
    }
    int getLength(){
        return size;
    }

}
