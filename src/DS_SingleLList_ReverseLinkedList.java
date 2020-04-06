public class DS_SingleLList_ReverseLinkedList {
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
        while(tNode!=null){
            System.out.print(tNode.data+" -> ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    static void reverse(){
        Node pointer = head;
        Node current= null; Node previous = null;

        while(pointer!=null){
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            head = current;
        }
    }
    public static void main(String args[]){
        insertAtBegining(new Node(1));
        insertAtBegining(new Node(2));
        insertAtBegining(new Node(3));
        insertAtBegining(new Node(4));
        printList();
        reverse();
        printList();
    }
}
