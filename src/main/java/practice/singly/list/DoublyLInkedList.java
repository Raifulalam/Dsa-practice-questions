package practice.singly.list;

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
        ListNode next;
        ListNode previous;
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
    public void addFirstNode(int data){
         this.head=new ListNode(data);
         head.next=head;
        size++;
    }
    public void print(){
        ListNode node=head;
        if(head==null){
            System.err.println("List is Empty");
            return;
        }else{
            while (node.next!=null){
                System.out.println(node.data+" ");

            }
            node=node.next;
        }
    }

    public static void main(String[] args){
        DoublyLInkedList list=new DoublyLInkedList();
        list.addFirstNode(35);
        list.addFirstNode(36);
        System.out.println(list.getLength());
        list.print();
    }

}
