import java.util.LinkedList;

public class LinkedListCreation {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedListCreation insert(LinkedListCreation list,int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedListCreation list){
        Node currNode = list.head;
        System.out.println("Creating Linked List");
        while(currNode!=null) {
            System.out.print(" "+currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String args[]){
        LinkedListCreation list = new LinkedListCreation();
        list = insert(list,9);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,2);

        printList(list);
    }
}
