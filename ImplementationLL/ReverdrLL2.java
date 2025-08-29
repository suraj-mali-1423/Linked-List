package ImplementationLL;

public class ReverdrLL2 {
    public static Node Reverse(Node head){

        if(head == null || head.next == null) return head;

        Node a = head.next;
        Node nh = Reverse(a);
        a.next = head;
        head.next = null;

        return nh;
    }
    public static void main(String[] args) {
        SLL list = new SLL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(60);
        list.print();

        Node temp = Reverse(list.head);

        while (temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
    }
}
