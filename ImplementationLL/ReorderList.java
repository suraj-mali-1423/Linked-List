package ImplementationLL;

public class ReorderList {
    public static Node  Reverse( Node head){
        Node C = head;
        Node N = null;
        Node P = null;
        while(C != null ){
            N = C.next;
            C.next = P;
            P = C;
            C = N;
        }
        return P ;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public  static void ReorderList(Node head){

         //Get The Middle Element
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = slow.next;
        slow.next = null;

        Node NewNode = Reverse(temp);
        Node dummy = new Node(-1);
        Node t = dummy;
        Node list1 = head;
        Node list2 = NewNode;
        Node N = null;
        while(list1 != null && list2 != null){
            t.next = list1;
            list1  = list1.next;
            t = t.next;
            t.next = list2;
            list2  = list2.next;
            t = t.next;
        }

        if(list1 == null){
             t.next = list2;
        }
        else{
            t.next = list1;
        }

        head = dummy.next;
        printList(head);
    }
    public static void main(String[] args) {
        SLL list = new SLL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(60);
        list.addAtTail(70);
        list.addAtTail(80);
        list.addAtTail(90);
        list.addAtTail(100);
        list.print();

        ReorderList(list.head);
    }
}
