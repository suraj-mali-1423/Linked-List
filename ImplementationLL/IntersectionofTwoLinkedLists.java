package ImplementationLL;

public class IntersectionofTwoLinkedLists {
    public  static int  GetLength( Node head ){
            int len = 0 ;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                len++;
            }

        return  len;
    }

    public static void Insertion( Node headA , Node headB){
           int A = GetLength(headA);
           int B = GetLength(headB);
           Node tempA = headA;
           Node tempB = headB;

           if(A > B){
               for (int i = 0; i < A-B ; i++) {
                    tempA = tempA.next;
               }
           }else{
               for (int i = 0; i < B-A ; i++) {
                   tempB = tempB.next;
               }
           }

           while (tempA != tempB){
               tempA = tempA.next;
               tempB = tempB.next;
           }

        System.out.println(tempA.value);
    }
    public static void main(String[] args) {
        Node common = new Node(90);
        common.next = new Node(50);
        common.next.next = new Node(60);

        SLL list = new SLL();

// List A
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = common;

// List B
        Node headB = new Node(11);
        headB.next = new Node(22);
        headB.next.next = new Node(33); // Added this node to avoid null issues
        headB.next.next.next = common;

        Insertion(headA, headB);

    }
}
