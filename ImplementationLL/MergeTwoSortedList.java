package ImplementationLL;

public class MergeTwoSortedList {
    public  static  Node Merge(Node l1 , Node l2 ){
            Node dummy = new Node(-1);
            Node  t = dummy;

            while(l1 != null && l2 != null){
                  if(l1.value <= l2.value){
                        t.next = l1;
                        l1 = l1.next;
                  }
                  else{
                       t.next = l2;
                       l2 = l2.next;
                  }
                  t = t.next;
            }

            while (l1 != null){
                t.next = l1;
                l1 = l1.next;
                t = t.next;
            }

        while (l2 != null){
            t.next = l2;
            l2 = l2.next;
            t = t.next;
        }

        return dummy.next;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Second sorted list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(l1);

        System.out.println("List 2:");
        printList(l2);

        Node merged = Merge(l1, l2);

        System.out.println("Merged List:");
        printList(merged);
    }
}
