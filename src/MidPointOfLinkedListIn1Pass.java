import java.util.LinkedList;

public class MidPointOfLinkedListIn1Pass {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void printList(){
        Node tNode = head;
        while(tNode != null){
            System.out.print(tNode.data+"->");
            tNode = tNode.next;
        }
        System.out.print("NULL");
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void printTheMidPoint(){

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }

    public static void main(String[] args){
       MidPointOfLinkedListIn1Pass obj = new MidPointOfLinkedListIn1Pass();
        for(int i=1;i<=6;i++){
            obj.push(i);
        }
        obj.printList();
        System.out.println();
        obj.printTheMidPoint();
    }

}
