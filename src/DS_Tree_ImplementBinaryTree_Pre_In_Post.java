public class DS_Tree_ImplementBinaryTree_Pre_In_Post {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

    public static void insert(Node root,int value){
        if(value<root.data){
            if(root.left!=null){
                insert(root.left,value);
            }else{
                root.left = new Node(value);
            }
        }else if(value > root.data){
            if (root.right != null) {
                insert(root.right,value);
            }else{
                root.right = new Node(value);
            }
        }
    }

    public void preOrderTraversal(Node root){
        if(root!=null) {
            System.out.print(root.data + " -> ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal(Node root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " -> ");
            inOrderTraversal(root.right);
        }
    }
    int leaves =0;
    public void postOrderTraversal(Node root){

        if(root!=null){
            leaves++;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " -> ");
        }
    }

    public static void main(String args[]){
        DS_Tree_ImplementBinaryTree_Pre_In_Post tree = new DS_Tree_ImplementBinaryTree_Pre_In_Post();
        Node root = new Node(5);
        System.out.println("Implementing Binary Search Tree");
        insert(root,2);
        insert(root,4);
        insert(root,8);
        insert(root,6);
        insert(root,7);
        insert(root,3);
        insert(root,9);
        tree.preOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(root);
        System.out.println();
        tree.postOrderTraversal(root);
        System.out.println();
        System.out.println(tree.leaves);
       }
}
