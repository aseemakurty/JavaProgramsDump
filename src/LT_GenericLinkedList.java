public class LT_GenericLinkedList<T> {

    Node<T> head;


    public  void insertAtBeginning(Node<T> newNode){
        if(newNode!=null){
            newNode.next = head;
            head = newNode;
        }
    }

    public  void insertAtEnd(Node<T> newNode){

            if(head == null){
               head  = newNode;
               return;
            }
            Node<T> temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            return;

    }

    public void insertAt(Node<T> prevNode, Node<T> newNode){
        newNode.next = prevNode.next;
        prevNode.next =  newNode;
    }

    public void printList(){
        Node<T> tNode = head;
        while(tNode!=null){
            System.out.print(tNode.data+ "-> ");
            tNode = tNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args){
        LT_GenericLinkedList<String> list = new LT_GenericLinkedList<String>();
        //LT_GenericLinkedList<String> list1 = new LT_GenericLinkedList<String>();
        //Adding elements at the beginning
        list.insertAtBeginning(new Node<String>("Ananya"));
        list.insertAtBeginning(new Node<String>("Anuhya"));
        list.insertAtBeginning(new Node<String>("S1"));
        list.insertAtBeginning(new Node<String>("S2"));
        list.printList();
        //Adding elements at the end
        list.insertAtEnd(new Node<String>("Ananya"));
        list.insertAtEnd(new Node<String>("Anuhya"));
        list.insertAtEnd(new Node<String>("S1"));
        list.insertAtEnd(new Node<String>("S2"));
        list.printList();
        list.insertAt(list.head.next,new Node<String>("New"));
        list.printList();
    }
}

class Node<T>{
     T data;
     Node<T> next;

    Node(T d){
        data = d;
        next = null;
    }
}
