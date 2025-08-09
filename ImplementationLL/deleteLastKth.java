package ImplementationLL;

public class deleteLastKth {
     public static Node deleteLastKth(Node head, int k){

         if(k <= 0 || head == null) {
             return head;
         }

         int len = 0;
         Node temp = head;
         while (temp != null ){
              temp = temp.next;
              len++;
         }

         if(k > len){
             return head;
         }
         if(k ==  len){
             return  head.next;
         }

         temp = head;
         for(int i = 0 ; i < (len-k-1) ; i++){
             temp = temp.next;
         }
         temp.next = temp.next.next;

         return head;

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

        Node ans = deleteLastKth(list.head , 2);
        while (ans != null){
            System.out.print(ans.value +"  ");
            ans = ans.next;
        }
    }
}
