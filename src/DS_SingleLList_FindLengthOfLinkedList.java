public class DS_SingleLList_FindLengthOfLinkedList {

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

    public static void main(String args[]){
        insertAtBegining(new Node(1));
        insertAtBegining(new Node(2));
        insertAtBegining(new Node(3));
        insertAtBegining(new Node(4));
        printList();
        String s= "Ananya";
    }
}
