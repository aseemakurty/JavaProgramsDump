import java.util.HashSet;

public class LT_BreakCycleInLinkedList {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList(Node tNode){
        //Node tNode = head;
        while(tNode!=null){
            System.out.print(tNode.data+ "-> ");
            tNode = tNode.next;
        }
    }
    static Boolean removeLoop(Node node){
        Boolean flag = false;
        HashSet<Node> set = new HashSet<>();
        Node prev = null;
        while(node!=null){
            if(set.contains(node)){
                prev.next = null;
                flag = true;
                break;
            }else{
                set.add(node);
                prev = node;
                node = node.next;
            }
        }

        return flag;
    }

    public static void main(String args[]){
        LT_BreakCycleInLinkedList llist = new LT_BreakCycleInLinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head.next;
        if(removeLoop(head)){
            System.out.print(" Broke the loop ");
        }
        llist.printList(head);
    }
}
