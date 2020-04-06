public class LinkedListDeletion {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedListDeletion insert(LinkedListDeletion list,int d){
        Node new_node = new Node(d);
        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedListDeletion list){
        Node curr_Node = list.head;
        System.out.println("Linked List Creation : ");
        while(curr_Node!=null){
            System.out.println(curr_Node.data);
            curr_Node = curr_Node.next;
        }
    }

    public static void deleteKey(LinkedListDeletion list, int d){
        Node curr_Node = list.head;
        Node prev = null;

        // If the deletionKey is the head od the list
//        if(curr_Node!=null && curr_Node.data==d){
//            list.head = curr_Node.next;
//        }


        //If the deletion key is not available in the list
//        if(curr_Node==null){
//            System.out.println(d+ " key is not present in the list");
//        }


        //If the deletion key is somewhere other than the head
        while(curr_Node!=null && curr_Node.data!=d){
            prev = curr_Node;
            curr_Node = curr_Node.next;
        }
        if(curr_Node!=null){
            prev.next = curr_Node.next;
        }
    }

    public static void main(String args[]){
        LinkedListDeletion list = new LinkedListDeletion();
        list = insert(list,2);
        list = insert(list,4);
        list = insert(list,6);
        list = insert(list,8);
        list = insert(list,10);
        list = insert(list,12);

        //Start of the head
        //deleteKey(list,2);

        //delete key which is not head
        deleteKey(list, 8);
        //Key not in list
        //deleteKey(list,13);
        printList(list);
    }
}
