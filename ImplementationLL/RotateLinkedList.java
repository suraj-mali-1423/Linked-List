package ImplementationLL;

public class RotateLinkedList {

    public static  Node Rotate(Node head , int k ){

         if(head == null || head.next == null) return head;
         Node slow = head;
         Node fast = head;
         Node Temp = head;

         int len = 0 ;
         while(Temp != null){
              Temp = Temp.next;
              len++;
         }

         k = k % len;
         if(k == 0) return head;

         for (int i = 0 ; i < k ; i++){
               fast = fast.next;
         }

         while(fast.next != null){
               slow  = slow.next;
               fast = fast.next;
         }

          Node Help = slow.next;
          slow.next = null;
          fast.next = head;

          return Help;
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
        list.print();

        Node temp = Rotate(list.head , 8);

         while(temp != null){
             System.out.print(temp.value+" -> ");
             temp = temp.next;
         }

        System.out.println("Null");
    }
}
