public class LT_BreakCycleInLinkedList_2 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    void detectAndRemoveLoop(Node head){
        Node slow = head, fast = head;
        slow = head.next;
        fast = head.next.next;

        while(fast!= null && fast.next!=null){
            if(slow==fast)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow==fast){
            // re checking again because the very first time slow and fast can meet at any place,
            // neednt be at the loop start, hence rechecking for the node that making a loop and ending it
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    void printList(Node head){
        Node tNode = head;
        while(tNode!=null){
            System.out.print(tNode.data+"-> ");
            tNode = tNode.next;
        }
    }
    public static void main(String[] args){
        LT_BreakCycleInLinkedList_2 list = new LT_BreakCycleInLinkedList_2();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
}
