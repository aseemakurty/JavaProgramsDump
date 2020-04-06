public class DS_SingleLList_FindNthNodeFromEnd {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    static void insertAtBegining(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    static void printList(){
        Node tNode = head;
        int length =0;
        while(tNode!=null){
            System.out.print(tNode.data+" -> ");
            tNode = tNode.next;
            length++;
        }
        System.out.println();
        System.out.println("Length is : "+length);
    }

    public static int getLastNode(int n) {
        Node fast = head;
        Node slow = head;
        int start = 1;
        while (fast.next != null) {
            fast = fast.next;
            start++;
            if (start > n) {
                slow = slow.next;
            }
        }
        System.out.println("Get element from "+n+" node from last "+slow.data);
        return slow.data;

    }

    public static void main(String args[]){
        insertAtBegining(new Node(8));
        insertAtBegining(new Node(7));
        insertAtBegining(new Node(6));
        insertAtBegining(new Node(5));
        insertAtBegining(new Node(4));
        insertAtBegining(new Node(3));
        insertAtBegining(new Node(2));
        insertAtBegining(new Node(1));

        printList();

        getLastNode(3);
        getLastNode(2);
        getLastNode(1);
    }

}
