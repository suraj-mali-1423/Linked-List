package ImplementationLL;

import ImplementationLL.SLL;

public class Swapping2 {
    public  static  Node SwappingNth(Node head , int k ){
         int cnt = 1;
         Node First = null;
         Node Second = head;
         Node Curr = head;

         while(Curr != null){
              if(cnt == k){
                   First = Curr;
              }

              if(cnt > k){
                   Second = Second.next;
              }

              Curr = Curr.next;
              cnt++;
         }

         int temp = First.value;
         First.value = Second.value;
         Second.value = temp;

         return head;
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.print();
        SwappingNth(list.head , 2);

        list.print();

    }
}
