package ImplementationLL;

public class ReverLinkedList2 {
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

    public static Node Reverse2(Node head , int l , int r){
        if(head.next == null || head == null ) return head;
          int len = 1;
          Node a = null;
          Node b = null;
          Node c = null;
          Node d = null;

          Node temp = head;
          while (temp != null){

              if(len ==  l-1){
                   a = temp;
              }

              if(len ==  l){
                  b = temp;
              }

              if(len == r){
                  c = temp;
              }
              if(len == r+1){
                  d = temp;
              }
              len++;
              temp = temp.next;
          }


            if(a != null )a.next = null;
            if(c != null ) c.next = null;

            Reverse(b);

          if(a != null ) a.next = c;
          b.next = d;

          if(a == null) return c;
          return head;

    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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
        list.print();

        Node temp = Reverse2(list.head , 1 , 9);
        printList(temp);
    }
}
