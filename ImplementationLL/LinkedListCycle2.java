package ImplementationLL;

public class LinkedListCycle2 {
    public static Node LinkedListCycle(Node head) {

        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if(slow != fast) return null;

        Node Temp = head;
        while (Temp != slow) {
            slow = slow.next;
            Temp = Temp.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);
        headA.next.next.next = new Node(40);
        headA.next.next.next.next = new Node(50);
        headA.next.next.next.next.next = headA.next.next;
        Node temp = LinkedListCycle(headA); // ✅ fixed function call

        System.out.println(temp.value);
    }
}
