package ImplementationLL;

public class FindNthNodeFromLast {
    public static void Find(Node head , int k){
        Node fast = head;
        Node slow = head;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        if(fast == null){
            System.out.println(slow.value);
            return;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.value);

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

        Find(list.head , 6);

    }
}
