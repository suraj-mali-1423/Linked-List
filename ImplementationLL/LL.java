package ImplementationLL;

import java.sql.ResultSet;

class Node {
    int value;
    public Node next;

    Node(int val){
        this.value = val;
        this.next = null;
    }
}
class SLL{
   public Node head;
    public  Node tail;
    int Size = 0;
    // Display
    public void print(){
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.value+" -> ");

            temp =  temp.next;
        }
        System.out.println("null");
    }

    public  int getSize(){
         return Size;
    }


    public void addAtTail(int value) {
        Node temp = new Node(value);

        if(head == null){
             head = temp;
             tail = temp;
             Size++;
             return;
        }

        tail.next = temp;
        tail = temp;
        Size++;
    }

    public  void addAtHead( int value){
         Node temp = new Node(value);

          if(head == null){
              head = temp;
              tail = temp;
              Size++;
              return;
          }

          temp.next = head;
          head = temp;
          Size++;
    }

    public void addAtKth(int value , int k ){
        Node NewNode = new Node(value);

        // base case
        if(k > Size || k < 0) return;

        // LL is empty
        if(k == 0 ){
             NewNode.next = head;
             head = NewNode;
             // You can call also addAtHead() function
             if(tail == null){
                 tail = NewNode;
             }
             return;
        }

        // Insert at the Kth
        Node temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

       NewNode.next = temp.next;
        temp.next = NewNode;


        // set the tail if next is nulll
        if(NewNode.next == null){
            tail = NewNode;
        }

        Size++;
    }



    public void updateList(int index , int value){
         if(index < 0 || index > getSize() ){
             System.out.println("Error Are Coming....");
             return;
         }
         if(index == 0){
             head.value = value;
         }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public  int getElement(int index){
        if(index > getSize() || index < 0){
            System.out.println("Invalid Index !!!");
            return -1;
        }
        // Main Code
         Node temp = head;
        for(int i = 0; i < index ; i++){
            temp = temp.next;
        }

        return temp.value;
    }



    public void deleteAtHead(){
        if(getSize() == 0 ){
            System.out.println("List is empty....");
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;

        Size--;
    }

    public void deleteAtend(){
          if(getSize() == 0){
              System.out.println("List is empty....");
              return;
          }

          Node temp = head;

          while(temp.next.next != null){
               temp = temp.next;
          }

          tail = temp;
          tail.next = null;
          Size--;
    }

    public void  deleteAtKth(int index){
          if(index > getSize() || index < 0){
              System.out.println("Not Possible to delete....");
              return;
          }

          // if delete head
          if(index == 0){
              deleteAtHead();
              Size--;
              return;
          }


         // if delete another index
        Node temp = head;
        int cnt = 1;
        while (cnt < index && temp.next != null){
            temp = temp.next;
            cnt++;
        }

        Node Help = temp.next;

        // if the temp next and next is null then set the value of the tail
        if(temp.next.next == null){
            tail = temp;
        }

        temp.next = temp.next.next;
        Help = null;

        Size--;
    }
}

public class LL {
    public static void main(String[] args) {
          SLL ll = new SLL();

        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.print();
    }
}
