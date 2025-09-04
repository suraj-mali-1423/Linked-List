package ImplementationLL;

public class AddTwoNumber {
    public  static  Node TwoSum(Node list1 , Node list2){
            Node dummy = new Node(0);
            Node curr = dummy;
            int carry =  0;
        while (list1 != null || list2 != null || carry != 0) {
               int sum = carry;

               if(list1 != null) {
                    sum += list1.value;
                    list1 = list1.next;
               }
              if(list2 != null) {
                  sum += list2.value;
                  list2 = list2.next;
              }

              carry = sum / 10;
              curr.next = new Node(sum % 10);
              curr = curr.next ;
        }

             return dummy.next;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void  Reverse( Node head){
        Node C = head;
        Node N = null;
        Node P = null;
        while(C != null ){
            N = C.next;
            C.next = P;
            P = C;
            C = N;
        }

    }
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.addAtTail(3);
        list1.addAtTail(5);
        list1.addAtTail(2);
       list1.print();

        SLL list2 = new SLL();
        list2.addAtTail(9);
        list2.addAtTail(5);
        list2.addAtTail(3);
        list2.print();

        Node temp = TwoSum(list1.head , list2.head);

        printList(temp);
    }
}
