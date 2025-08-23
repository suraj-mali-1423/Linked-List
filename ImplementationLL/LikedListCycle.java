package ImplementationLL;

public class LikedListCycle {
    public static boolean LinkedCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        System.out.println("Slow : "+slow.value);
        System.out.println("Fast : "+ fast.value);


        return false;
    }

    public static void main(String[] args) {
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);
        headA.next.next.next.next =  headA.next.next;
        System.out.println(LinkedCycle(headA)); // directly calling the static method

    }
}
