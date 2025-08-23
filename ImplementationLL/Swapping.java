package ImplementationLL;

public class Swapping {

    public static void Delete(Node head , int n ){

        Node fast = head;
        Node slow = head;
        Node First = head;

        // First
        for( int i = 1 ; i < n ; i++){
            First = First.next;
        }
        System.out.println(First.value);
        // Move fast point nth step
        for( int i = 1 ; i <= n ; i++){
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("Slow Value " + slow.value +"First  "+First.value);
        int temp = slow.value;
        slow.value = First.value;
         First.value = temp;

        System.out.println("Slow Value " + slow.value +"First  "+First.value);

    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.print();

        Delete(list.head , 2);
        list.print();
    }
}
