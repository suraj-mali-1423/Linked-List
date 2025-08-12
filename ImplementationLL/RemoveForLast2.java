package ImplementationLL;

public class RemoveForLast2 {
    public static void Delete(Node head , int n ){

        Node fast = head;
        Node slow = head;

         // Move fast point nth step
        for( int i = 1 ; i <= n ; i++){
            fast = fast.next;
        }
        System.out.println(fast.value);

        while (fast != null){
             fast = fast.next;
             slow = slow.next;
        }
        System.out.println(slow.value);
        slow.next = slow.next.next;

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

        Delete(list.head , 4);
    }
}
