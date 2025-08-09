package ImplementationLL;

public class deleteLeftMiddle {
    public  static Node deleteLeft(Node  head){
        if(head.next == null)return  null;
         Node slow = head;
         Node fast = head;

         while(fast.next.next != null && fast.next.next.next != null){
             slow = slow.next;
             fast = fast.next.next;
         }
         Node  temp = slow;
         slow.next = slow.next.next;
         temp = null;

         return head;
    }
    public static void main(String[] args) {
        SLL list = new SLL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(50);
        list.print();
        deleteLeft(list.head);
        list.print();
    }
}
