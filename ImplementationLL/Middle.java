package ImplementationLL;
import ImplementationLL.SLL;
public class Middle {
    public static Node  middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(60);
        list.print(); // 10 -> 20 -> 30 -> null

        Node ans = middleNode(list.head);

        System.out.println(ans.value);
    }
}
