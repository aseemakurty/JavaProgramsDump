import java.util.Stack;

public class DS_Tree_CountLeafNodesInBinaryTree {

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
    public static boolean isLeaf(Node node){
        return node.left==null && node.right==null ? true : false;
    }
    public static void printLeafNodes(Node root){
        if(root == null)
            return;
        if(root.left==null && root.right==null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node node = stack.pop();

            if(node.left!=null)
                stack.push(node.left);

            if(node.right!=null)
                stack.push(node.right);

            if(isLeaf(node)){
                System.out.print(node.data);
            }
        }
    }
    public static void main(String args[]){
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        printLeafNodes(root);
    }
}
