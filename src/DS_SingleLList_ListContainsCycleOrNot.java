public class DS_SingleLList_ListContainsCycleOrNot {
    static Node head;
    static class Node{
         int data;
         Node next;
         Node(int d){
             data =d;
         }

    }

    static void insertAtEnd(Node newNode){
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void isCyclic(Node head){
        Node slow = head;
        Node fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;

           if(slow==fast){
               System.out.print("List has cycles");
               break;
           }
       }
       if(slow==fast){
           slow = head;
           while(slow.next!=fast.next){
               slow=slow.next;
               fast = fast.next;
           }
           System.out.println("Starting node of Cycle :"+fast.data);
           fast.next = null;
       }

    }

    public static void printList(){
        Node tNode = head;
        while(tNode!=null){
            System.out.print(tNode.data+" -> ");
            tNode = tNode.next;
        }
    }
    public static void main(String args[]){
        insertAtEnd(new Node(1));
        insertAtEnd(new Node(2));
        insertAtEnd(new Node(3));
        insertAtEnd(new Node(4));
        insertAtEnd(new Node(5));
        head.next.next.next.next.next = head.next.next;
        isCyclic(head);
        printList();
    }
}
