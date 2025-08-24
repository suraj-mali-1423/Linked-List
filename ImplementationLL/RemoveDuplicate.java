package ImplementationLL;

public class RemoveDuplicate {

    public static Node RemoveD(Node head){
         Node a = head;
         Node b = head.next;

         while(b != null){
                if(a.value == b.value){
                     b = b.next;
                }
                else{
                     a.next = b;
                     a = b;
                }

         }
         a.next = null;
        return head;
    }
    public static void main(String[] args) {
        SLL list = new SLL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(30);
        list.addAtTail(30);
        list.addAtTail(40);
        list.print();
        Node temp = RemoveD(list.head);

        while(temp != null){
            System.out.print(temp.value);
               temp = temp.next;
        }
    }
}
