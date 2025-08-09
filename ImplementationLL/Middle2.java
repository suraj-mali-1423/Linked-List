package ImplementationLL;

import java.util.List;

public class Middle2 {

    public static void middleNode2(Node head){

         Node temp = head;
         int len = 0;
         while (temp != null){
             temp = temp.next;
             len++;
         }


          Node NewNode = head;
         for (int i = 0 ; i < len/2 ; i++){
             NewNode = NewNode.next;
         }

        System.out.println(NewNode.value);

    }
    public static void main(String[] args) {
        SLL list = new SLL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);

        list.print();
        middleNode2(list.head);


    }
}
