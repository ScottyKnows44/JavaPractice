import java.io.PrintStream;

public class TreeSort {

    private static Node root;

    static class Node{
        int key;
        Node left,right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public TreeSort() {
        root = null;
    }
    static void insert(int key){
        root = insertRec(root, key);
    }

    static Node insertRec(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key > root.key){
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
         return root;
    }

    static void treeins(int[] arr){
        for (int i =0; i <arr.length;i++){
            insert(arr[i]);
        }
    }

    static void printInorder(Node root){
        if(root != null){
            printInorder(root.left);
            System.out.println(root.key);
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeSort tree = new TreeSort();
        int[] arr = {1,4,65,8,2,2,56,6,8};
        treeins(arr);
        printInorder(root);
    }
}
