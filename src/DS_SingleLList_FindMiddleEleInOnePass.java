public class DS_SingleLList_FindMiddleEleInOnePass {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void insert(Node newNode){
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void printList(){
        Node tNode = head;
        while(tNode!=null){
            System.out.print(tNode.data+" -> ");
            tNode = tNode.next;
        }
        System.out.println();
    }
    public static void findMiddleElement(Node head){
//        Node current = head;
//        Node middle = head;
//        int length =0;
//        while(current.next != null){
//            length++;
//            if(length%2 ==0){
//                middle = middle.next;
//            }
//            current = current.next;
//        }
//
//        if(length%2 == 1){
//            middle = middle.next;
//        }
//
//        System.out.println("length of LinkedList: " + length);
//        System.out.println("middle element of LinkedList : " + middle.data);

        Node slow = head;
        Node fast = head;
        slow = head.next;
        fast = head.next.next;
        int length =0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element is : "+slow.data+ " and the index is : "+slow);
        //System.out.println("Length is : "+length);
    }
    public static  void main(String args[]){
        DS_SingleLList_FindMiddleEleInOnePass obj = new DS_SingleLList_FindMiddleEleInOnePass();
        insert(new Node(1));
        insert(new Node(2));
        insert(new Node(3));
        insert(new Node(4));
        insert(new Node(5));
        insert(new Node(6));
        insert(new Node(7));
        printList();
        findMiddleElement(head);

    }
}
