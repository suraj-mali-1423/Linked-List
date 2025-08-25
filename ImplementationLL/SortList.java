package ImplementationLL;

import java.util.ArrayList;
import java.util.Comparator;

public class SortList {


    public static Node Sort(Node head) {
        if (head == null) return null;

        ArrayList<Node> arr = new ArrayList<>();

        // Store all nodes in array
        Node temp = head;
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }

        arr.sort(Comparator.comparing(n -> n.value));

        for (int i = 0; i < arr.size() - 1  ; i++) {
              arr.get(i).next = arr.get(i+1);
        }
        arr.get(arr.size() - 1).next = null;

         return arr.get(0);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Node l1 = new Node(6);
        l1.next = new Node(3);
        l1.next.next = new Node(0);
        l1.next.next.next = new Node(4);
        l1.next.next.next.next = new Node(5);
        l1.next.next.next.next.next= new Node(2);

        System.out.println("List 1:");
        printList(l1);

        Node temp = Sort(l1);

        printList(temp);

    }
}
