public class BSTFindMaxinRightSubArray {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        int[] arr = {3, 15, 13, 16, 4, 1};
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(15);
        root.right.left = new Node(13);
        root.right.right = new Node(16);
        root.right.left.left = new Node(4);
        //root.right.left.right = new Node(14);

        for(int i=0;i<arr.length;i++){
            Node node  = search(root,arr[i]);
            if(node!=null && node.right!=null){
                System.out.println(node.right.data);
            }
            if(node!=null && node.left==null && node.right==null){
                System.out.println(node.data);
            }
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static Node search(Node presentNode , int data){
        if(presentNode!=null && presentNode.data==data){
            return presentNode;
        }
        if(presentNode.data>data)
            return search(presentNode.left,data);
        else
            return search(presentNode.right,data);
    }
}