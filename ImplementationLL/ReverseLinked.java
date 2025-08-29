package ImplementationLL;

public class ReverseLinked {
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

          return P;
     }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
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
        System.out.println("null");
    }
}
